# KBSCodingChallenge
Hi this is my submission for the Kaleido Coding Challenge! 

My approach was a little more longwinded(I think) than it truly needed to be, but I had a lot of fun thinking this problem through! :D

Instructions:
   To get the code up and running, it is as simple as saving the repository onto your desktop and utilizing your commandline. 
    Of course, depending on where it is saved this step will be different, but just make sure that if you utilize the ls           command you can see the "KaleidoClientCode.java" "Compound.java" "Plate.java" and "Well.java" classes! 
    
    1. Download the repository 
    2. Use the commandline to access it
    3. Type "javac KaliedoClientCode.java Compound.java Plate.java Well.java" or "javac *.java" into the commandline or              terminal 
    4. Type java KaliedoClientCode 
    5. It should be running now and instead of creating a test suite, I wanted you to be able to interact with the program as        if you were a scientist trying to enter information!
    
 I hope that you enjoy my solution! (: 
 
 
  Additionally, to give some insight into my progression through this problem, when I approach a problem I always start out on   some notebook paper or a white board (if there is one around). Normally, I like to go pretty in-depth and it can be time       consuming for me because not only do I take notes and summarize the problem, but I do draw skeletons of my code and even 
  will write code as well to give me an even clearer idea of where I am going before I start typing. 
  
  Therefore, to give some better progression, I decided to type in some thoughts I was thinking in certain classes to show you 
  some insight. If you want, I can also take some screenshots of my notes and email them to you as well as it might depict
  more of my intial thoughts about the problem. 
  
  However, I find that through spending extra time mapping out the problem, I run into less bugs later. 
 
 ASSUMPTIONS:
 1. I am assuming that(P-12345.A2 as an example) P-12345 is the plate and A2 is the well, so when it is time to transfer           content from well to another well (P-3.A4 as an example) P-3 is another plate and A4 is a well. However, P-3 is a plate,       it isn't the "main plate" and is more of a sub plate. 
 
   For a visual-ish hierarchial example, 
   
      S <---- the compound
      P-12345 <--- parent plate or main plate
      P-3 <---- still a plate, but a sub plate within this compound (not a completely new plate)
