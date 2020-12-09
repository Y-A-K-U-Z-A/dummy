import java.util.Random;

public class MessageSet {
    private final Random random= new Random();
    private int bound;
    private final String[] jokes = new String[]{
            "I just read that someone in London gets stabbed every 52 seconds. Poor guy.",
            "What's red and bad for your teeth? A brick.",
            "Why did Mozart kill all of his chickens? When he asked them who the best composer was, they all replied, \"Bach, Bach, Bach.",
            "Give a man a match, and he'll be warm for a few hours. Set a man on fire, and he will be warm for the rest of his life.",
            "My wife and I have reached the difficult decision that we do not want children. If anybody does, please just send me your contact details and we can drop them off tomorrow.",

"Even people who are good for nothing have the capacity to bring a smile to your face. For instance, when you push them down the stairs.",
            "I visited my friend at his new house. He told me to make myself at home. So I threw him out. I hate having visitors.",
"I was reading a great book about an immortal dog the other day. It was impossible to put down.",
"The other day, my wife asked me to pass her lipstick but I accidentally passed her a glue stick. She still isn't talking to me.",
"Never break someone's heart, they only have one. Break their bones instead, they have 206 of them.",
"I'll never forget my Granddad's last words to me just before he died. \"Are you still holding the ladder?\"",
"It turns out a major new study recently found that humans eat more bananas than monkeys. It's true. I can't remember the last time I ate a monkey.",
"What's the difference between jelly and jam? You can't jelly a clown into the tiny car.",
"\"I work with animals,\" the guy says to his date.  \"That's so sweet,\" she replies. \"I love a man who cares about animals. Where do you work?\" \"I'm a butcher,\" he says.",
"Why was the leper hockey game canceled? There was a face off in the corner.",
"Today was a terrible day. My ex got hit by a bus. And I lost my job as a bus driver!",
"\"Just say NO to drugs!\" Well, If I'm talking to my drugs, I probably already said yes.",
"I don't have a carbon footprint. I just drive everywhere.",
"It's important to have a good vocabulary. If I had known the difference between the words 'antidote' and 'anecdote,' one of my good friends would still be alive.",
"What's the last thing to go through a fly's head as it hits the windshield of a car going 70 mph? Its butt.",
"An apple a day keeps the doctor away. Or at least it does if you throw it hard enough.",
"Imagine if you walked into a bar and there was a long line of people waiting to take a swing at you. That's the punch line.",
"I have a fish that can breakdance! Only for 20 seconds though, and only once.",
"Today I decided to go visit my childhood home. I asked the residents if I could come inside because I was feeling nostalgic, but they refused and slammed the door on my face. My parents are the worst.",
"I have a joke about trickle down economics. But 99% of you will never get it.",
    "Господ е българин."};

    public String getRandomMessage(){
        int index = random.nextInt(this.jokes.length-1);
        return jokes[index];
    }
}
