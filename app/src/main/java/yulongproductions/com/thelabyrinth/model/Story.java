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
                R.raw.death_sound,
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
                R.raw.death_sound,
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
                R.raw.death_sound,
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
                R.raw.death_sound,
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
                R.drawable.labryinth_cave,
                R.raw.dead_silence,
                "That was the strangest thing you've seen so far and you start running past the clearing in fear for your life. Making the journey through the woods was tough, since it was dark and the terrain of the forest floor was rough. That annoying incessant buzzing sound soon dissipates as you get further away. Out of breath, you stumble upon a cave with a small opening.",
                new Choice("Explore the cave", 24),
                new Choice("Go around it", 25)
        );

        this.pages[20] = new Page (
                R.drawable.labryinth_dark_river,
                R.raw.dead_silence,
                "Although the fish did attack and try to drown you, you feel a pang of sympathy for it. It was just in its nature to pull off a stunt like that so you decide to let it live. You pick it up with both hands (it was surprisingly heavy) and toss it back into the river, hoping it gets back to safety. You check your surroundings to see that you can follow the river or go up the hill into the woods",
                new Choice("Follow the river", 26),
                new Choice("Go uphill", 27)
        );

        this.pages[21] = new Page (
                R.drawable.labryinth_water_zombie,
                R.raw.scary_dead_silence,
                "This fishy creature just tried to drown you. No way in hell are you going to let it live. You start stomping on the fish repeatedly, with all your strength, trying to crush it in vengeance. With every stomp, it wailed, until you stomp it one last time, when its body explodes into blood and guts around you. However, it seems that the blood had attracted more creatures and suddenly, weird looking humanoid zombie-looking creatures jump out of the river, looking at you like it's dinner time (which it probably was).",
                new Choice("START RUNNING", 27)
        );

        // Takes the user back to the river pages
        this.pages[22] = new Page (
                R.drawable.labryinth_dark_hole,
                R.raw.dead_silence,
                "That's the deadliest thing you've seen so far and you don't want to die, so you turn back and run as fast as you can, not looking back once. You can hear footsteps pounding on the floor after you, so you pick up the pace, running like Usain Bolt through the darkness. As you reach the room with the hole, you stop and try to catch your breath...that thing doesn't seem to be near, so you relax, recovering from your marathon. However, that all too familiar growling sound next to you. Suddenly, the hole seemed like a good idea.",
                new Choice("JUMP THROUGH THE HOLE", 13)
        );

        this.pages[23] = new Page (
                R.drawable.labryinth_berserker,
                R.raw.dead_silence,
                "Since that creature looks big, it must be slow! You've watched enough football to know how to juke people so you fun really far to the right to try to go around the big thing, but it moved surprisingly fast, and swiped its arm to the right, knocking the wind out of you as you fly into the wall. While you're disoriented, it growls and charges at you really fast.",
                new Choice("Get up and fight it", 28)
        );

        this.pages[24] = new Page (
                R.drawable.labryinth_cave_interior,
                R.raw.dead_silence,
                "Since nothing dangerous ever happens in caves, you venture inside, hoping to find something to help you get back home. As expected, it is incredibly dark so you turn on your flashlight (luckily you didn't leave it there, right?) to look around. So far, the cave seems like it goes primarily straight, with a bit of curves. Suddenly, you hear a crumbling noise coming from ahead, as if there was a large opening ahead.",
                new Choice("Investigate the noise", 29)
        );

        this.pages[25] = new Page (
                R.drawable.labryinth_skyrim_woods,
                R.raw.dead_silence,
                "Most people would venture inside the cave to see what's in there, but you're not most people. You traverse around the cave, trying to see what else is around. So far, nothing but more forested areas. Surprisingly, you see some signs of life, in the form of deer, foxes, and even some rabbits. This forest actually seems like the only thing that's normal...that is until all the animals started running away in a single direction, as if something were after them.",
                new Choice("Run with the animals", 30)
        );

        this.pages[26] = new Page (
                R.drawable.labryinth_night_lake,
                R.raw.dead_silence,
                "All rivers lead to nice places, so you follow the river by its banks, listening to the calm running of the water. The sun was starting to set and it was getting darker so you pick up the pace, and start running, eventually coming to see the river leading into a grand lake, with some shiny object floating above the lake's center.",
                new Choice("Swim to the object", 31),
                new Choice("Go to the woods", 27)
        );

        this.pages[27] = new Page (
                R.drawable.labryinth_scary_woods,
                R.raw.dead_silence,
                "You head into the woods, which immediately seemed like a bad idea at first, since it was relatively dark due to the sun going down. You pull out your flashlight to help guide you. At first, walking through seemed rather normal, until you started hearing the rustling of leaves somewhere above you. Looking up, you see nothing, but as you start to move, you hear rustling once again.",
                new Choice("Tread carefully", 32),
                new Choice("Screw that, run through!", 33)
        );

        this.pages[28] = new Page (
                R.drawable.labryinth_stick,
                R.raw.dead_silence,
                "With some newly found conviction, you roll sideways, dodging the monster as it careens into the wall, getting its head stuck. You look around the room for a weapon of some sort. To your luck, you see a small stick (more like a twig) in the corner. You run and grab it, while the beast is stuck in the wall. You start trying to stab it in the back, but it doesn't really work that well, since it's completely armored in bone. You keep stabbing it until it punctures a tiny bit. However, the beast seems like it's about to free itself.",
                new Choice("One final stab", 34)
        );

        this.pages[29] = new Page (
                R.drawable.labryinth_cavern,
                R.raw.spooky_ambience,
                "Continuing forward deeper into the cave, the crumbling gets louder. You see a bit of light ahead (not produced by your flashlight) and run towards it. You find yourself in a large, open cavern mystified with dark mist, blocking your depth of view. The place feels very eerie and seemed like a place that would definitely be considered haunted. Suddenly the forest seemed like a good idea.",
                new Choice("Explore the cavern", 35),
                new Choice("Backtrack to the woods", 27)
        );

        this.pages[30] = new Page (
                R.drawable.labryinth_velociraptor_pack,
                R.raw.dead_silence,
                "Animals can typically sense danger before it even happens (maybe they're psychic?) so you sprint alongside them, at a surprisingly fast pace. Predatory sounds were coming from behind you, and you turn to see a pack of dinosaur looking creatures (Velociraptors maybe?) speeding towards you. One of them leaps out right in front of you, making you fall to the ground.",
                new Choice("Crawl away in the opposite direction", 36),
                new Choice("Start kicking it", 37)
        );

        this.pages[31] = new Page (
                R.drawable.labryinth_time_gear,
                R.raw.dead_silence,
                "That shiny object could be the answer you've been looking for, so you dive into the lake, surprised by its warmth. Despite the dark ambiance, the object gave enough light to help you tread through the waters. As you get closer, you can see what seems to be a gear, radiating light energy. You can hear a humming noise coming from it, creating ripples in the water right beneath it. This thing has to be it. It has to be the answer!",
                new Choice("Grab the gear", 38)
        );

        this.pages[32] = new Page (
                R.drawable.labryinth_scary_woods,
                R.raw.dead_silence,
                "Maybe it won't notice you if you go very slowly, sticking to the shadows. Right now, you don't even know if it's something dangerous. It would just be the wind. As you slowly stalk forward, you listen carefully for rustling above, but you don't hear any. Going at a snail's pace, the journey was incredibly boring, as you move from tree to tree. In the darkness, you could make out a cave just up ahead. It would be a good idea to wait in there until the sun came out again.",
                new Choice("Go into the cave", 24)
        );

        // DEATH PAGE
        this.pages[33] = new Page (
                R.drawable.labryinth_skyrim_troll_black,
                R.raw.death_sound,
                "In fear, you start sprinting through the woods, not caring about the loud crunching of dried leaves beneath your feet. The rustling above seems louder as the thing knows you're on the move. In your haste, your left foot gets caught on something, making you fly forward, falling to the ground. Your flashlight disappears somewhere, and darkness surrounds the area. You try to get up, but a large foot stomps on your back, holding you down. A large hand grabs you by the neck, choking the life out of you. You turn to look at it, revealing a large, black yeti looking creature. It growls, and then slashes you into bits."
        );

        this.pages[34] = new Page (
                R.drawable.labryinth_cave_interior,
                R.raw.dead_silence,
                "You raise the stick high into the air with both arms and thrust downwards with all your might. Surprisingly, the stick pierces through its body, with a cloud of white dust flying out. As it screams in agony, you start running into the place it was blocking, noticing there was a tiny bit of night light at the end. You make it to the end and see that it leads you outside, with grass and trees in the area.",
                new Choice("Go to the woods", 27)
        );

        this.pages[35] = new Page (
                R.drawable.labryinth_deeper_cave,
                R.raw.dead_silence,
                "You go into the large cavern, which was quiet. Not knowing what was in there, you walk slowly, trying not to make any noise. It was futile, however, as a booming voice echoed through the cavern: \"I'm impressed, %1$s. I truly am. You have made it this far, but you're not going to get past me. Enter the passageway in front of you, and I'll kill you myself.\"",
                new Choice("Fight the boss", 39),
                new Choice(this.pages[29].getChoice2().getText(), 27)
        );

        // DEATH PAGE
        this.pages[36] = new Page (
                R.drawable.labryinth_death_screen,
                R.raw.death_sound,
                "In fear for your life, you turn away and crawl hastily, but somehow the creature must've known you were trying to get away and you felt their pack rush to your side, gnawing at you with their teeth. They begin slashing and scratching you everywhere, and even digging in with their teeth. You scream as they tear your body apart, enjoying their meal."
        );

        this.pages[37] = new Page (
                R.drawable.labryinth_velociraptor,
                R.raw.dead_silence,
                "You quickly back away on your butt, and then launch a few kicks at its head, making it flinch, angering it. It growls at you, before moving closer. However, you kick again with more force than before, making it stumble backwards, dizzy. In that small moment of time, you make your move and sweep at its legs, making it tumble to the ground, and unable to attack anymore. You see that the animals are still running, but some of the predator packs start looking at you, since one of their members had been taken down.",
                new Choice("Start running", 40)
        );

        // END GAME FOR ONE OF THE BRANCHES
        this.pages[38] = new Page (
                R.drawable.labryinth_game_over,
                R.raw.game_over,
                "You grab the gear, and suddenly, everything changes. You close your eyes as light explodes everywhere, the impact making you fly away. You brace yourself for the impact as you're falling, but you land on something soft...and oddly familiar. You open your eyes and see that you're in your room at home. It looks as if nothing's changed. Was it all just a cray dream? You get up and see a note on your table, with a message written in clear cursive: \"If you're reading this, then it means you have made it out and cleared my hellish maze. I will have to find another victim. Go and live your life, %1$s.\""
        );

        this.pages[39] = new Page (
                R.drawable.labryinth_phalos_portal,
                R.raw.dead_silence,
                "It's now or never. Might as well fight, since there's no telling when this hell will end. You step into the dark passageway, and suddenly the entire place is lit up with torches all around, creating a path for you. At the end of the passageway was a strange rectangular tablet of some sort, with a glowing red light right at its center. There are words enscribed: \"A limb's touch brings a new world.\"",
                new Choice("Place your hand in the center", 41)
        );

        this.pages[40] = new Page (
                R.drawable.labryinth_abandoned_house,
                R.raw.dead_silence,
                "You run as fast as you can, swerving left and right through branches, desperately trying to avoid the growling of those creatures. You eventually stop, trying to catch your breath. You turn around to see that nothing had followed you, so you continue walking forward through the cluster of leaves. Soon, you see a small house in the middle of a clearing. It looked abandoned, like no one's been there in years.",
                new Choice("Go in the house", 42),
                new Choice("Continue through the trees", 43)
        );

        this.pages[41] = new Page (
                R.drawable.labryinth_faraway_boss,
                R.raw.scary_dead_silence,
                "Placing your hand in the center seemed to have activated some sort of portal. The room warps until you're in a spooky fortress, with a lot of fog in the distance. It was daytime, but it didn't feel safe at all. In front of you was a large, wooden bridge, and in the distance was a large giant, clad in black armor, still as a statue. You walk across the bridge, entering the arch at the end. The figure suddenly looks up, drawing its large axe. This must be the boss.",
                new Choice("Confront the boss", 44)
        );

        this.pages[42] = new Page (
                R.drawable.labryinth_abandoned_house_interior1,
                R.raw.dead_silence,
                "You enter the dark, scary house, hoping to find something helpful. As expected, the house was dark and completely silent, except for the creaking of the wood. You whip out your flashlight to help you see in the dark. There seemed to be a lot of doors and rooms on the first floor. Most of them were empty except for a few drawers and dusty boxes.",
                new Choice("Investigate the living room", 45),
                new Choice("Go upstairs", 46)
        );

        this.pages[43] = new Page (
                R.drawable.labryinth_spriggan,
                R.raw.dead_silence,
                "You've seen enough scary movies to know that only danger can be inside, so going past it would be the logical choice. You choose to walk instead, since nothing is chasing you at the moment and it almost seems peaceful. That is, until you run into the Spriggan. It's almost as if it had materialized out of nowhere from a tree and scared you half to death. You try to run, but it blocks your path, as if it wants to fight.",
                new Choice("Fight", 46),
                new Choice("RUN THE HELL AWAY", 47)
        );

    }

    public Page getPage(int pageNumber) {
        return this.pages[pageNumber];
    }

    public boolean doesNotExist(int pageNumber) {
        return this.pages[pageNumber].doesNotExist();
    }

    public int getWordCount(String pageText) {
        String[] words = pageText.trim().split("\\s+");
        return words.length;
    }

    public int getCharCount(String pageText) {
        return pageText.trim().length();
    }

    public int getTotalWordCount(int totalPages) {
        int total = 0;
        for (int i = 0; i <= totalPages; i++) {
            int wordCount = this.getWordCount(this.getPage(i).getText());
            total += wordCount;
        }
        return total;
    }

    public int getTotalCharCount(int totalPages) {
        int total = 0;
        for (int i = 0; i <= totalPages; i++) {
            int charCount = this.getCharCount(this.getPage(i).getText());
            total += charCount;
        }
        return total;
    }
}
