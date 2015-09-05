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
                R.raw.dead_silence,
                "The dim light flickers as you start to regain your vision. Your mind is boggled and you feel heavy. You get up and groan to yourself \"Where am I? I don't recognize this place...\" You try to look at your surroundings but you find that you're in an enclosed room with only dimly lit passageway in front of you. Not only that, but written in blood on the walls was a single name: %1$s.",
                new Choice("Head towards the passageway", 1),
                new Choice("Stay in the room", 2)
        );

        this.pages[1] = new Page (
                R.drawable.labryinth_long_hallway,
                R.raw.dead_silence,
                "You slowly work up the courage and move out of this godforsaken room. You head into the passageway and see that it stretches into the darkness and you don't know how far it is. You look forward and then back into the room again. Foward, backward, forward, backward. You're not sure what to do. Go venture into the darkness, or go back to the first room?",
                new Choice("Keep going", 3),
                new Choice("Go back", 4)
        );

        // DEATH PAGE
        this.pages[2] = new Page (
                R.drawable.labryinth_death_screen,
                R.raw.scary_ringtone,
                "Your mind slowly withers as the horrors of the room seep into your very soul. You begin to hallucinate and scratch the walls, marking them with the scent of your blood, but your ultimate demise as well. You want this horror to end, so you repeatedly slam your head against the wall, as if it were to the beat of a drum. Soon, the wall is splattered with blood, and the room is filled with the stench of a corpse."
        );

        this.pages[3] = new Page (
                R.drawable.labryinth_page3,
                R.raw.dead_silence,
                "You decide that there's no point in going back so you keep going forward. You walk and you walk, but this hallway seems endless... How long has it been? Minutes? Hours? You can't tell, but your feet keep carrying you. Eventually, you see some light ahead, so in a mad haze of false accomplishment, you start sprinting towards it. As you approach the light, you realize it's a flashlight laying on the ground, shining towards you.",
                new Choice("Inspect the flashlight", 5),
                new Choice("Ignore it and keep going", 6)
        );

        // DEATH PAGE
        this.pages[4] = new Page (
                R.drawable.labryinth_death_screen,
                R.raw.scary_ringtone,
                "You turn back and start running towards the original room, but you find that it's gone, and in its place was a wall, with the message \"To live is to die...and to die is to live. We have you, %1$s. There's no escape\" etched into it. Crying out in a mix of anger and frustration, you kick at it angrily, but that activated something, as the wall grinded together and turned into chainsaw blades. They whirred to life and came towards you. Your cry was (literally) cut short as your limbs were torn apart, blood splattering the walls, not only marking your death, but another sacrifice."
        );

        this.pages[5] = new Page (
                R.drawable.labryinth_flashlight,
                R.raw.dead_silence,
                "You pick up the flashlight, and realize it's metallic blue in color...and stained in what you assume is blood. Not really caring, you flash it in front of you and start walking. With the illumination from the flashlight, you feel much safer and more confident. Eventually you reach the end of the the passageway, only to find that there's a fork that splits left and right.",
                new Choice("Take the left fork", 7),
                new Choice("Take the right fork", 8)
        );

        this.pages[6] = new Page (
                R.drawable.labryinth_flashlight,
                R.raw.dead_silence,
                "You run past the flashlight like an idiot, but something brings you back. You feel like it may come in handy sometime, so you backtrack to get it. " + this.pages[5].getText(),
                new Choice(this.pages[5].getChoice1().getText(), this.pages[5].getChoice1().getNextPage()),
                new Choice(this.pages[5].getChoice2().getText(), this.pages[5].getChoice2().getNextPage())
        );

        this.pages[7] = new Page (
                R.drawable.labryinth_alchemy,
                R.raw.dead_silence,
                "Following your instincts, you take the left path, and you run through the tunnel, which eventually leads you to a singular room that has a medieval feel to it. On the right looked like some sort of alchemy table and on the left looked to be some sort of arcane enchanter. In the middle of the room, however, was a table with two large, differently colored vials: blue and yellow.",
                new Choice("Take the blue one", 9),
                new Choice("Take the yellow one", 10)
        );

        this.pages[8] = new Page (
                R.drawable.labryinth_trap_door,
                R.raw.dead_silence,
                "Being the punster that you are, you decide to go the RIGHT way, running through the tunnel, flashlight in hand, shining through the darkness. Eventually, you hear the rush of water coming from somewhere under you. You inspect the floor and find a hidden trapdoor, but in front of you at the end of the tunnel is an alcove of some sort.",
                new Choice("Run to the ladder", 11),
                new Choice("Go through the trapdoor", 13)
        );

        // Basically death in a different form (not using the regular death screen
        this.pages[9] = new Page (
                R.drawable.labryinth_soul_cairn,
                R.raw.scary_ringtone,
                "Since blue is your favorite color, you decide to drink the contents of it. Immediately, you recoil at the taste and drop to your knees, cluthcing your throat and gasping, desperately trying to breathe. You feel a poisonous sensation travel to your eyes and your vision becomes black... When you wake up again, the world is warped. The land is a desolate purple, with mindless souls wandering about. You look at your hands, only to find that you look like a soul as well, trapped in this wasteland of the dead. It seems the blue vial had sucked out your soul."
        );

        this.pages[10] = new Page (
                R.drawable.labryinth_log_bridge,
                R.raw.dead_silence,
                "Since yellow is a color your mother likes, you decide to drink the contents of it. Immediately, the entire room warps as your entire body seamlessly disappears, changing the scene. When your body reappears, you find that you're on a bridge, over the roaring sound of pure, gushing water. Suddenly, you hear a booming, raspy voice come from nowhere: \"%1$s...welcome to my domain. I don't know how you made it here, but you'll be dead soon!\"",
                new Choice("Run across the bridge", 12),
                new Choice("Jump into the rapids", 13)
        );

        this.pages[11] = new Page (
                R.drawable.labryinth_dark_room,
                R.raw.dead_silence,
                "You decide that climbing the ladder is a good decision, since up is better. As you begin climbing, you see that it leads to a trapdoor above you, so you just push it up and climb through. The room is dimly lit but you can see that the room is circular with only one path forward. The place doesn't look all that friendly and you get out of there quickly, following the path ahead. Eventually, you find a bottomless hole and understand that you must make a choice.",
                new Choice("Jump into the dark hole", 13),
                new Choice("Keep going forward", 14)
        );

        // The page with only one button to go forward due to text being too long
        // Linear branch
        this.pages[12] = new Page (
                R.drawable.labryinth_nemeton,
                R.raw.dead_silence,
                "Where did that voice come from? It doesn't matter too much, since you have a fear of heights. Even though you're not a gambler, you decide that the road ahead of the bridge is your best bet. You sprint across, not looking down at the gushing rapids and make it safely to the other side, which by appearence seemed like a large forested area. You see a clearing up ahead and choose to see what's there. In the center of the clearing was a large tree stump.",
                new Choice("Investigate the tree", 15)
        );

        // All occurences of jumping into a hole / the rapids
        this.pages[13] = new Page (
                R.drawable.labryinth_river,
                R.raw.dead_silence,
                "Being more comfortable on the ground, you decide to jump down. Your breath is sucked right out of your lungs as you begin your free fall, into the depths. The noise of gushing water gets louder as you soon impact the surface, creating a loud SPLASH noise. You hold your breath and swim to the top, noticing that you were in some sort of river, with the land near you. Suddenly, you feel something tugging on your pants, like an animal had clenched its jaw around you, trying to pull you under.",
                new Choice("Swim to shore", 16),
                new Choice("Fight it off", 17)
        );

        this.pages[14] = new Page (
                R.drawable.labryinth_dark_passageway,
                R.raw.dead_silence,
                "No one in their right minds would ever jump down that hole so you decide to move forward into the passageway. It's just like the first tunnel you were in, with everything darkened, so you don't know how far it is. You use your flashlight (luckily you didn't ignore it right?) to help guide you forward. You stop suddenly, hearing a faint and eerie voice in the background. Listening carefully, you hear a message being repeated over and over again in silent whispers: \"Kill them...kill them all!\"",
                new Choice("Continue walking", 18)
        );

        this.pages[15] = new Page (
                R.drawable.labryinth_swarm,
                R.raw.dead_silence,
                "You walk up to the tree stump to get a closer look. It seems as if the tree had been untouched for a long time and you're the first one to stumble upon it in ages. Its old rings seemed completely intertwined together as if they were the fates weaving the lives of heroes. Being curious, you place your hand on the stump...just to see what would happen. Immediately, the ground shook as if there was an earthquake. The crackling of bark could be heard as the stump imploded from the inside, with hordes of flies coming out of it.",
                new Choice("Run for your life", 19)
        );

        this.pages[16] = new Page (
                R.drawable.labryinth_ghiozzo,
                R.raw.scary_dead_silence,
                "Luckily, you were the swim captain of your high school and you expertly weave your arms through the water like an expert. The thing, whatever it would be, is still tugging onto your pants, but you get closer and closer to shore. The moment your arms tough the craggy coast, you exert all of your remaining strength to climb up, dragging the creature along with you, blindly reaching for it and slamming it to the ground. It was a fish, gasping for air.",
                new Choice("Throw it back into the river", 20),
                new Choice("Kill it!", 21)
        );

        // Death by Ghiozzo
        this.pages[17] = new Page (
                R.drawable.labryinth_ghiozzo,
                R.raw.scary_dead_silence,
                "In a mad haze for survival, you do the only thing that comes to your mind: crazily flinging your body around, trying to shake off the creature, but it was to no avail. Every single time you kicked and struggled to the surface for a precious breath of air, you're pulled back under again, like an insomniac stuck in a nightmare. The scary fish hybrid attacking you soon bites your skin, making you gasp in pain, filling your lungs with water as you slowly sink to the bottom, knowing that you failed to escape this prison."
        );

        this.pages[18] = new Page (
                R.drawable.labryinth_berserker2,
                R.raw.scary_dead_silence,
                "You run further inside the passageway and the whispers get louder. You also hear a strange animalistic growl somewhere. When the growling noise gets really loud, a large (not so human) humanoid looking thing appears in front of you. It looked like it was wearing armor made completely of bone and had a skull for a helmet on its head. It stares and you and then growls ferociously.",
                new Choice("Turn back and run", 22),
                new Choice("Try to go around it", 23)
        );

        this.pages[19] = new Page (
                0, // Picture of a dark cave in the woods
                R.raw.dead_silence,
                "That was the strangest thing you've seen so far and you start running past the clearing in fear for your life. Making the journey through the woods was tough, since it was dark and the terrain of the forest floor was rough. That annoying incessant buzzing sound soon dissipates as you get further away. Out of breath, you stumble upon a cave with a small opening.",
                new Choice("Explore the cave", 24),
                new Choice("Go around it", 25)
        );

        this.pages[20] = new Page (
                0, // a visual splash to make users believe it was the fish thrown into the river again
                R.raw.dead_silence,
                "Although the fish did attack and try to drown you, you feel a pang of sympathy for it. It was just in its nature to pull off a stunt like that so you decide to let it live. You pick it up with both hands (it was surprisingly heavy) and toss it back into the river, hoping it gets back to safety. You check your surroundings to see that you can follow the river or go up the hill into the woods",
                new Choice("Follow the river", 26),
                new Choice("Go uphill", 27)
        );

    }

    public Page getPage(int pageNumber) {
        return this.pages[pageNumber];
    }

    public boolean doesNotExist(int pageNumber) {
        return this.pages[pageNumber].doesNotExist();
    }
}
