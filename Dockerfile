 FROM openjdk:11-jre-slim
 ADD LargerOfTwoNumbers.class /
CMD ["java", "LargerOfTwoNumbers"] 