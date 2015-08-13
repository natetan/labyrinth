package yulongproductions.com.thelabyrinth.model;
import yulongproductions.com.thelabyrinth.R;

/**
 * Created by Yulong on 7/25/2015.
 */
public class Story {
    private Page[] pages;

    public Story() {
        this.pages = new Page[100];

        this.pages[0] = new Page (
                R.drawable.labyrinth_start_image,
                "The dim light flickers as you start to regain your vision. Your mind is boggled and you feel heavy. You get up and groan to yourself \"Where am I? I don't recognize this place...\" You try to look at your surroundings but you find that you're in an enclosed room with only dimly lit passageway in front of you. Not only that, but written in blood on the walls was a single name: %1$s.",
                new Choice("Head towards the passageway", 1),
                new Choice("Stay in the room", 2)
        );

        this.pages[1] = new Page (
                R.drawable.labryinth_long_hallway,
                "You slowly work up the courage and move out of this godforsaken room. You head into the passageway and see that it stretches into the darkness and you don't know how far it is. You look forward and then back into the room again. Foward, backward, forward, backward. You're not sure what to do. Go venture into the darkness, or go back to the first room?",
                new Choice("Keep going", 3),
                new Choice("Go back", 4)
        );

        // DEATH PAGE
        this.pages[2] = new Page (
                R.drawable.labryinth_death_screen,
                "Your mind slowly withers as the horrors of the room seep into your very soul. You begin to hallucinate and scratch the walls, marking them with the scent of your blood, but your ultimate demise as well. You want this horror to end, so you repeatedly slam your head against the wall, as if it were to the beat of a drum. Soon, the wall is splattered with blood, and the room is filled with the stench of a corpse."
        );

        this.pages[3] = new Page (
                R.drawable.labryinth_page3,
                "You decide that there's no point in going back so you keep going forward. You walk and you walk, but this hallway seems endless... How long has it been? Minutes? Hours? You can't tell, but your feet keep carrying you. Eventually, you see some light ahead, so in a mad haze of false accomplishment, you start sprinting towards it. As you approach the light, you realize it's a flashlight laying on the ground, shining towards you.",
                new Choice("Inspect the flashlight", 5),
                new Choice("Ignore it and keep going", 6)
        );

        // DEATH PAGE
        this.pages[4] = new Page (
                R.drawable.labryinth_death_screen,
                "You turn back and start running towards the original room, but you find that it's gone, and in its place was a wall, with the message \"To live is to die...and to die is to live. We have you, %1$s. There's no escape\" etched into it. Crying out in a mix of anger and frustration, you kick at it angrily, but that activated something, as the wall grinded together and turned into chainsaw blades. They whirred to life and came towards you. Your cry was (literally) cut short as your limbs were torn apart, blood splattering the walls, not only marking your death, but another sacrifice."
        );

        this.pages[5] = new Page (
                R.drawable.labryinth_flashlight,
                "You pick up the flashlight, and realize it's metallic blue in color...and stained in what you assume is blood. Not really caring, you flash it in front of you and start walking. With the illumination from the flashlight, you feel much safer and more confident. Eventually you reach the end of the the passageway, only to find that there's a fork that splits left and right.",
                new Choice("Take the left fork", 7),
                new Choice("Take the right fork", 8)
        );

        this.pages[6] = new Page (
                R.drawable.labryinth_flashlight,
                "You run past the flashlight like an idiot, but something brings you back. You feel like it may come in handy sometime, so you backtrack to get it. " + this.pages[5].getText(),
                new Choice(this.pages[5].getChoice1().getText(), this.pages[5].getChoice1().getNextPage()),
                new Choice(this.pages[5].getChoice2().getText(), this.pages[5].getChoice2().getNextPage())
        );

        this.pages[7] = new Page (
                R.drawable.labryinth_alchemy,
                "Following your instincts, you take the left path, and you run through the tunnel, which eventually leads you to a singular room that has a medieval feel to it. On the right looked like some sort of alchemy table and on the left looked to be some sort of arcane enchanter. In the middle of the room, however, was a table with two large, differently colored vials: blue and yellow.",
                new Choice("Take the blue one", 9),
                new Choice("Take the yellow one", 10)
        );

        this.pages[8] = new Page (
                R.drawable.labryinth_trap_door,
                "Being the punster that you are, you decide to go the RIGHT way, running through the tunnel, flashlight in hand, shining through the darkness. Eventually, you hear the rush of water coming from somewhere under you. You inspect the floor and find a hidden trapdoor, but in front of you at the end of the tunnel is an alcove of some sort.",
                new Choice("Run to the ladder", 11),
                new Choice("Go through the trapdoor", 14)
        );

        // Basically death in a different form (not using the regular death screen
        this.pages[9] = new Page (
                R.drawable.labryinth_soul_cairn,
                "Since blue is your favorite color, you decide to drink the contents of it. Immediately, you recoil at the taste and drop to your knees, cluthcing your throat and gasping, desperately trying to breathe. You feel a poisonous sensation travel to your eyes and your vision becomes black... When you wake up again, the world is warped. The land is a desolate purple, with mindless souls wandering about. You look at your hands, only to find that you look like a soul as well, trapped in this wasteland of the dead. It seems the blue vial had sucked out your soul."
        );

        this.pages[10] = new Page (
                R.drawable.labryinth_log_bridge,
                "Since yellow is a color your mother likes, you decide to drink the contents of it. Immediately, the entire room warps as your entire body seamlessly disappears, changing the scene. When your body reappears, you find that you're on a bridge, over the roaring sound of pure, gushing water. Suddenly, you hear a booming, raspy voice come from nowhere: \"%1$s...welcome to my domain. I don't know how you made it here, but you'll be dead soon!\"",
                new Choice("Run across the bridge", 13),
                new Choice("Jump into the rapids", 14)
        );

        this.pages[11] = new Page (
                0, // Image of a dark circular room
                "",
                new Choice("Jump into the hole", 14), // leads to the rapids as well
                new Choice("", 12)
        );
    }

    public Page getPage(int pageNumber) {
        return this.pages[pageNumber];
    }
}
