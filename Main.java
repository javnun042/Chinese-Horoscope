import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter your birth year");

    int byear = scan.nextInt(); //tracks the birth year of the user before using modulus division to get their zodiac placement between 0-11

    int zodiacP = byear % 12; //zodiacP means zodiac placement in the 12 number cycle 

    if(zodiacP == 0){
      System.out.println("Your Chinese Zodiac sign is the Monkey!");
      System.out.println("Those with the monkey sign are lively and clever in all that they do. In some areas, monkeys are even thought to be protectors of babies from evil spirits. Despite their braggart and tricky nature, monkeys are capable and just, making them strong companions.");
    }
    else if(zodiacP == 1){
      System.out.println("Your Chinese Zodiac sign is the Rooster!");
      System.out.println("Roosters are independent and capable, with a hint of impatience and selfishness. Many with this sign are born naturally attractive and like to dress to show off.");
    }
    else if(zodiacP == 2){
      System.out.println("Your Chinese Zodiac sign is the Dog!");
      System.out.println("Those with the dog sign are attuned with their human spirit and are incredibly loyal. Despite their sensitivity, they make for brave and responsible companions.");
    }
    else if(zodiacP == 3){
      System.out.println("Your Chinese Zodiac sign is the Pig!");
      System.out.println("Those with the pig sign are carriers of wealth and luck. They tend to be easily influenced and realistic, but nevertheless are sincere and compassionate towards others");
    }
    else if(zodiacP == 4){
      System.out.println("Your Chinese Zodiac sign is the Rat!");
      System.out.println("Even if they are not revered by many, rats are incredibly vigorous and adaptive. Despite their timidity, they are also passionate and optimistic about the events of their lives.");
    }
    else if(zodiacP == 5){
      System.out.println("Your Chinese Zodiac sign is the Ox!");
      System.out.println("Ox signs tend to be stubborn, but that just means that they are stay firm and have an unwavering courage towards the decisions they make in life. Loyalty, honesty, and logic are also strong traits of this sign.");
    }
    else if(zodiacP == 6){
      System.out.println("Your Chinese Zodiac sign is the Tiger!");
      System.out.println("Tiger's are brave and powerful individuals. Usually seen as cruel and terrifying, tigers are also adventurous and a patron guide for children in some cultures (cute)");
    }
    else if(zodiacP == 7){
      System.out.println("Your Chinese Zodiac sign is the Rabbit!");
      System.out.println("People with the rabbit sign are friendly and noble in nature. Rabbits are also seen as signs of hope and life in Chinese culture");
    }
    else if(zodiacP == 8){
      System.out.println("Your Chinese Zodiac sign is the Dragon!");
      System.out.println("Another symbol of power, those with the dragon sign are revered with the same respect as imperial nobles. Their strongest traits are their determination and ambition, though they often lack in willpower.");
    }
    else if(zodiacP == 9){
      System.out.println("Your Chinese Zodiac sign is the Snake!");
      System.out.println("Snakes are smart and cunning, making them the perfect symbol for those of born under their years in the zodiac cycle. Despite their indifference and tendency towards skepticism, snakes are also full of aspirations and intelligence.");
    }
    else if(zodiacP == 10){
      System.out.println("Your Chinese Zodiac sign is the Horse!");
      System.out.println("If vitality was a symbol, it would come in the form of a horse! Being amiable, talented, and energetic, horse signs make for having a keen eye and great thinking skills. They can also be overconfident and a bit too ambitious at times, but it's also one of their greatest strengths.");
    }
    else if(zodiacP == 11){
      System.out.println("Your Chinese Zodiac sign is the Sheep!");
      System.out.println("Being quiet and timid, sheep are also revered for their past purpose of sacrifice for good fortune. They can be indecisive and impractical at times, but sheep are especially sympathetic and sociable with others, making them excellent caregivers.");
    }
  }
}