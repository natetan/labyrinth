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
    }

    public Page getPage(int pageNumber) {
        return this.pages[pageNumber];
    }
}
