# Hash Table
This project implements a Hash Table with quadratic probing for collision resolution.

## Hashing
The hash table has 1009 slots and the hash function is defined as *h*(𝑘)=𝑘 𝑚𝑜𝑑 1009.

### Collision resolution policy.
The probe function is defined as 𝑃(𝑘, 𝑖) = (c1 * i)^2 + (c2 * i) + c3 for some choice of constants 𝑐1, 𝑐2, and 𝑐3. Then the 𝑖 th value in the probe sequence would be (h(𝑘) + 𝑃(𝑘, 𝑖)) 𝑚𝑜𝑑 1009. For example, let’s assume that a probe function is 𝑃(𝑘,𝑖) = 𝑖^2. If h(𝑘1) = 10, the probe sequence for 𝑘1 is 10, 11, 14, 19, and so forth. 𝑐1, 𝑐2, and 𝑐3 are given when you create a hash table.
### Deletion.
Let's assume that h(𝑘1) = h(𝑘2) = h(k3) =𝑖𝑛𝑑𝑒𝑥, and 𝑘1 was inserted first, then 𝑘2, then 𝑘3. After that, you deleted 𝑘1 from the hash table setting it back to 𝑛𝑢𝑙𝑙. When later you will search for 𝑘2 or 𝑘3, you will find that *h*(𝑘2) = *h*(𝑘3) = 𝑖𝑛𝑑𝑒𝑥 and 𝑡𝑎𝑏𝑙𝑒\[𝑖𝑛𝑑𝑒𝑥] = 𝑛𝑢𝑙𝑙. Therefore you will get a wrong answer: 𝑘2 or 𝑘3 is not in the table. To solve this problem, you need to set 𝑡𝑎𝑏𝑙𝑒\[𝑖𝑛𝑑𝑒𝑥] with a special marker when a key is deleted from the table. In this assignment, you have to set the special marker as ‘-1’.

The specific operations:
- **Create**: Creating a new hash table that has 1009 slots. Also the quadratic probing collision resolution policy has to be defined with given parameters.
- **Insert**: Inserting the key into the hash table using the hash function and the collision resolution policy. Also this prints the index (the position of the key inserted in the hash table). The duplicated keys are not allowed for insertion.
- **Delete**: Deletes the key from the hash table. If there is no such key in the table, the message ```Failed to find 𝑘𝑒𝑦``` has to be printed and nothing happens to the table. It also sets the special marker as ‘-1’ when you delete the key.
- **Search**: finds the index of the key in the hash table. If there is no such key in the table, the message ```Failed to find 𝑘𝑒𝑦``` has to be printed.

Here are several assumptions for clarify.
- All keys are positive integers.
- The hash table has 1009 slots, and the hash function is h(𝑘) = 𝑘 𝑚𝑜𝑑 1009.
- The probe function is defined as 𝑃(𝑘, 𝑖) = (c1 * i)^2 + (c2 * i) + c3 and 𝑐1, 𝑐2, and 𝑐3 are given as parameters.
- All given integers are distinct.
- The special marker for deletion is -1.
