# Human Resource
This project manages the human resource jobs, such as hiring, merging teams, calculating the ability of employees and teams. 

## What does the Human Resource Project do?

This project implements human resource managing program, which is called **HumanResource**. The requirements of HumanResource are as follows:
- *Hiring* : When hiring a person, John registers the person’s ID and the person’s ability together. The person is recognized as a group and becomes the leader of the group.
- *Merging* :
  - When a group and another group are *merged*, the leader of the merged group is the leader of the more powerful group (More powerful means that the sum of people’s ability in the group is higher.). The merged group’s ability is the sum of two group’s ability. If the two group have the same ability, the leader with the lower ID becomes the leader of the merged group.
  - It is also able to merge all two pairs. For example, when a person A and another person B are merged, A and B and all their bosses are placed directly under the leader of each group, and the two groups are merged. 
- Additional functions :
  - AbilityOfPerson: Print out the ability of the person.
  - DepthOfPerson: Print out how far the leader is from the person.
  - AbilityOfGroup: The input has to be the person’s ID. Print out the sum of the abilities of all people in the group the person belongs to.
  - SizeOfGroup: The input has to be the person’s ID. Print out the number 4
of people in the group the person belongs to.

Here are several assumptions for clarity:
- Everyone has different ID.
- The maximum number of people is 100,000.
- Once people are hired by the company, they do not leave the company.
- Path compression occurs only when a merge occurs. If you just find the root of some nodes, path compression does not happen.
- Each person has values of “Parent”, “Ability”, “GroupAbility”, and “GroupSize”. However, “GroupAbility” and “GroupSize” is only used for leaders. Therefore, for leaders, both values must be stored correctly, but non-leaders may have dummy values.

## Inputs and outputs
This project has three files, “ParPtrTree.java”, the “HumanResource.java”, and “Main.java” in “PA_03_human_resource” java project. 

### Specification of inputs
- ```hire (person_id) (ability)``` : person_id is the id of the person, ability is the ability of the person.
- ```merge (person1_id) (person2_id)``` : the group of person1 and person2 are merged.
- ```aop (person_id)``` : means the ability of person of id.
- ```dop (person_id)``` : means the depth of the group where the person belongs to.
- ```aog (person_id)``` : means the ability of the group the person belongs to.
- ```sog (person_id)``` : means the size of the group the person belongs to.

### Sample inputs and outputs
Sample inputs:
```
hire 1 1
hire 2 2
hire 3 3
merge 1 2
merge 1 2
aop 1
aop 2
aop 3
dop 1
dop 2
dop 3
aog 1
aog 2
aog 3
sog 1
sog 2
sog 3
```
Sample outputs:
```
The group of 1 and the group of 2 are merged.
The two members are in the same group already.
1
2
3 
1 
0 
0
3
3
3
2
2
1
```
