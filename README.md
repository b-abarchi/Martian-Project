# Martian-Project
Abstract Classes &amp; Interfaces, One-to-Many, ArrayList.  50 methods for 9 classes
1.	Write the abstract Martian class.

2.	Write the RedMartian class.

3.	Write the RedMartianTest class with test methods:

a.	testSpeakAndToString  - I’m suggesting test two methods (speak and toString) in one test method. You are just checking to see that the format that was requested is realized by your code. And, the toString for the MartianManager class will use the toString for RedMartian (and GreenMartian) – so you want to make sure format is correct before then.
b.	testEquals_Success – Create two reds that have the same id and make sure the return is true. 
c.	testEquals_Fail – Similar to previous except the return is false
d.	testCompareTo_Negative – Create two reds such that the first is “less than” the second and thus you expect the return to be negative.
e.	testCompareTo_Positive – Similar to previous test.
f.	testCompareTo_Zero – Similar to previous test, i.e. two reds with the same id.

4.	Write the Teleporter interface.

5.	Write the GreenMartian class.

6.	Write the GreenMartianTest class with test methods: 

a.	testSpeakAndTeleportAndToString – Similar to testSpeakAndToString above.
b.	testEquals_Success – Similar to version in RedMartianTest above, except use 2 greens.
c.	testEquals_Fail – Similar to version in RedMartianTest above, except use 2 greens.
d.	testEqualsRedAndGreen_Success –  Similar to version in RedMartianTest above, except use 1 red and 1 green.
e.	testCompareToRedAndGreenSuccess –  Similar to version in RedMartianTest above, except use 1 red and 1 green.

7.	Write the MartianManager class.

8.	Write the MartianManagerTest class with test methods:

a.	addMartian_Red_Success – add a red and verify only one martian, and no teleporters. <br />
b.	addMartian_Green_Success – add a green and verify only one martian, and one teleporter.<br />
c.	addMartian_RedGreen_Failure – add a red, add a green with same id,  and verify only one martian, and no teleporters.<br />
d.	addMartian_GreenRed_Failure – add a green, add a red with same id,  and verify only one martian, and one teleporter.<br />
e.	testContains_Success – add a few, then ask if it contains a martian (red or green) with an id that does not exist.<br />
f.	testContains_Failure – add a few, then ask if it contains a martian (red or green) with an id that exists.<br />
g.	testGetMartianAt_ValidIndex – I’d suggest adding 4 martians, the call method with a valid index.<br />
h.	testGetMartianAt_InvalidIndex_Low – Test with an index that is negative.<br />
i.	testGetMartianAt_InvalidIndex_High – Test with an index that is >= size of list.<br />
j.	testGetMartianClosestTo_Index_LowerMatch – I’d suggest: add 2 reds and 2 greens with id’s like: 1, 3, 8, 13. Then call method with id=4, expect to find martian with id=3<br />
k.	testGetMartianClosestTo_Index_LowerMatch – I’d suggest: add 2 reds and 2 greens with id’s like: 1, 3, 8, 13. Then call method with id=6, expect to find martian with id=8<br />
l.	testGetMartianClosestTo_Martian_LowerMatch – I’d suggest: add 2 reds and 2 greens with id’s like: 1, 3, 8, 13. Then call method with a martian with id=6, expect to find martian with id=8. We’ll just do one test for this method.<br />
m.	testGetMartianWithId_Success – Add 4 martians, then call with an id that exists.<br />
n.	testGetMartianWithId_Failure – Add 4 martians, then call with an id that does not exist.<br />
o.	getSortedMartians – Add 4 martians with ids (in this order): 4, 8, 1, 2. Verify that sorted order is correct AND that order is preserved in the internal arraylist.<br />
p.	testGetTeleporterAt_ValidIndex – I’d suggest adding 6 martians with 4 being green, the call method with a valid index for teleporters.<br />
q.	testGetTeleporterAt_InvalidIndex_Low – Test with an index that is negative.<br />
r.	testGetTeleporterAt_InvalidIndex_High – Test with an index that is >= size of teleporters list.<br />
s.	testGroupSpeak – I’d suggest, add 2 reds and a green and verify format of output is correct.<br />
t.	testGroupTeleport – I’d suggest, add 1 reds and and 3 greens and verify format of output is correct.<br />
u.	testObliterateTeleporters_One – I’d suggest: add 3 including exactly 1 green. <br />
v.	testObliterateTeleporters_Many – I’d suggest: add 6 including exactly 3 greens. <br />
w.	testRemoveMartianWithId_Success_Red – Add 2 reds and 2 greens, then call with an id that exists in a red<br />
x.	testRemoveMartianWithId_Success_Red – Add 2 reds and 2 greens, then call with an id that exists in a green<br />
y.	testRemoveMartianWithId_Failure – Add 4 martians, then call with an id that does not exist.<br />
z.	testToString – I’d suggest: add 2 reds and 2 greens and verify output.<br />
aa.	testBattle_Small – You’ll want to carefully construct this test. When you create the martians and invaders, I suggest putting a comment beside that tells what the power is (for easy reference). For example:<br />

RedMartian r1 = new RedMartian(1,1,1); // power=2
RedMartian r2 = new RedMartian(2,2,2); // power=4
GreenMartian g1 = new GreenMartian(3); // power=1

I’d suggest something like this: a 2 reds and 2 greens to MM. Then create 2 invaders: 1 red and 1 green. Set their id’s such that one invader gets a kill, and the other doesn’t.<br /> Thus, only 1 kill. Need to verify that that both martians and “killed” lists are correct. You might just print the id’s of the martians and the ids of those killed.<br />

Actually, for this method, I would have a bunch of tests: (a) 3 martians, 1 invader, get a kill, (b) 3 martians, 1 invader no kills, (c) then the one above, (d) 5 martians, 3 invaders, 2 kills, (e) 2 martians, 2 invaders, both killed, (f) 2 martians, 3 invaders, both killed.<br />

However, you can just write one more if you like – the one next.<br />

bb.	testBattle_Larger – I’d suggest: 5 martians, 3 invaders, 2 kills.<br />
