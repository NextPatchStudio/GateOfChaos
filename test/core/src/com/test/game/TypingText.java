package com.test.game;

import java.util.ArrayList;
import java.util.Random;

public class TypingText {
	
	private String[] textList = {"ACT", "ADD", "AGE", "AGO", "AIM", "AIR", "ALL",
			"AND", "ANT", "ANY", "ARM", "ART", "ASH", "ASK", "BAD", "BAG", "BAR",
			"BED", "BEE", "BEG", "BIG", "BIT", "BOX", "BOY", "BUS", "BUT", "BUY",
			"CAN", "CAP", "CAR", "CAT", "COW", "CRY", "CUP", "CUT", "DAY", "DIE",
			"DIG", "DIP", "DOG", "DOT", "DRY", "EAR", "EAT", "EGG", "END", "EYE",
			"FAR", "FAT", "FEW", "FIT", "FIX", "FLY", "FOR", "FOX", "FUN", "FUR",
			"GAS", "GET", "GOD", "GUN", "HAT", "HEN", "HER", "HIM", "HIS", "HIT",
			"HOT", "HOW", "HUT", "ICE", "ICY", "ILL", "INK", "ITS", "JAW", "JOB",
			"JOY", "KEY", "LAW", "LAY", "LEG", "LET", "LID", "LIE", "LIP", "LOG",
			"LOT", "LOW", "MAD", "MAN", "MAP", "MAT", "MAY", "MIX", "MUD", "NET",
			"NEW", "NOR", "NOT", "NOW", "NUT", "ODD", "OFF", "OIL", "OLD", "ONE",
			"OUR", "OUT", "OWE", "OWN", "PAN", "PAY", "PEN", "PER", "PET", "PIG",
			"PIN", "POT", "PUT", "RAT", "RAW", "RED", "RID", "ROB", "ROD", "ROW",
			"RUB", "RUN", "SAD", "SAY", "SEA", "SEE", "SET", "SEW", "SEX", "SHE",
			"SIT", "SIX", "SKY", "SON", "SUM", "SUN", "TAX", "TEA", "THE", "TIE",
			"TIN", "TOE", "TOO", "TOP", "TOY", "TRY", "USE", "WAR", "WAY", "WET",
			"WHO", "WHY", "WIN", "YES", "YET", "YOU", "ACHE", "ACID", "ALSO", "ARCH",
			"AREA", "ARMS", "ARMY", "ATOM", "AUNT", "AWAY", "BABY", "BACK", "BAKE",
			"BALL", "BAND", "BANK", "BARE", "BASE", "BATH", "BEAK", "BEAM", "BEAN",
			"BEAR", "BEAT", "BEER", "BELL", "BELT", "BEND", "BEST", "BILL", "BIND",
			"BIRD", "BITE", "BLOW", "BLUE", "BOAT", "BODY", "BOIL", "BOMB", "BONE",
			"BOOK", "BOOT", "BORN", "BOTH", "BOWL", "BURN", "BURY", "BUSH", "BUSY",
			"CAGE", "CAKE", "CALL", "CALM", "CAMP", "CARD", "CARE", "CART", "CASE",
			"CELL", "CENT", "CHIN", "CITY", "CLAY", "CLUB", "COAL", "COAT", "COIN",
			"COLD", "COMB", "COME", "COOK", "COOL", "COPY", "CORD", "CORN", "COST",
			"CROP", "CURE", "CURL", "DARE", "DARK", "DATE", "DEAD", "DEAL", "DEAR",
			"DEBT", "DEEP", "DEER", "DESK", "DIRT", "DISH", "DOOR", "DOWN", "DRAG",
			"DRAW", "DROP", "DRUG", "DRUM", "DUCK", "DULL", "DUST", "DUTY", "EACH",
			"EARN", "EAST", "EASY", "EDGE", "ELSE", "EVEN", "EVER", "EVIL", "FACE",
			"FACT", "FAIL", "FAIR", "FALL", "FAME", "FARM", "FAST", "FATE", "FEAR",
			"FEED", "FEEL", "FILL", "FILM", "FIND", "FINE", "FIRE", "FIRM", "FISH",
			"FIVE", "FLAG", "FLAT", "FLOW", "FOLD", "FOND", "FOOD", "FOOL", "FOOT",
			"FORK", "FORM", "FORT", "FOUR", "FREE", "FROM", "FULL", "GAIN", "GAME",
			"GATE", "GIFT", "GIRL", "GIVE", "GLAD", "GLUE", "GOAT", "GOLD", "GOOD",
			"GRAM", "GRAY", "GROW", "HAIR", "HALF", "HALL", "HAND", "HANG", "HARD",
			"HARM", "HATE", "HAVE", "HEAD", "HEAR", "HEAT", "HEEL", "HELP", "HERE",
			"HERS", "HIDE", "HIGH", "HILL", "HIRE", "HOLD", "HOLY", "HOME", "HOOK",
			"HOPE", "HORN", "HOST", "HOUR", "HUNT", "HURT", "IDEA", "INTO", "IRON",
			"JOIN", "JOKE", "JUMP", "JUST", "KEEN", "KEEP", "KICK", "KILL", "KILO",
			"KIND", "KING", "KISS", "KNEE", "KNOT", "KNOW", "LACK", "LADY", "LAKE",
			"LAMB", "LAMP", "LAND", "LAST", "LATE", "LAZY", "LEAD", "LEAD", "LEAF",
			"LEAN", "LEFT", "LEND", "LESS", "LIFE", "LIFT", "LIKE", "LIMB", "LINE",
			"LION", "LIST", "LIVE", "LOAD", "LOAF", "LOCK", "LONG", "LOOK", "LORD",
			"LOSE", "LOSS", "LOUD", "LOVE", "LUCK", "LUMP", "LUNG", "MAIL", "MAIN",
			"MAKE", "MALE", "MANY", "MARK", "MASS", "MEAL", "MEAN", "MEAT", "MEET",
			"MELT", "MEND", "MILE", "MILK", "MIND", "MINE", "MISS", "MIST", "MOON",
			"MORE", "MOST", "MOVE", "MUCH", "MUST", "NAIL", "NAME", "NAVY", "NEAR",
			"NEAT", "NECK", "NEED", "NEST", "NEWS", "NEXT", "NICE", "NINE", "NONE",
			"NOSE", "NOUN", "OBEY", "ONCE", "ONLY", "OPEN", "OURS", "OVER", "PACK",
			"PAGE", "PAIN", "PAIR", "PALE", "PARK", "PART", "PASS", "PAST", "PATH",
			"PICK", "PILE", "PINK", "PIPE", "PITY", "PLAN", "PLAY", "POEM", "POET",
			"POLE", "POOL", "POOR", "PORT", "POST", "POUR", "PRAY", "PULL", "PUMP",
			"PURE", "PUSH", "RACE", "RAIN", "RANK", "RARE", "RATE", "READ", "REAL",
			"RENT", "REST", "RICE", "RICH", "RIDE", "RING", "RIPE", "RISE", "RISK",
			"ROAD", "ROCK", "ROLL", "ROOF", "ROOM", "ROOT", "ROPE", "ROSE", "RUDE",
			"RUIN", "RULE", "RUSH", "SAFE", "SAIL", "SALE", "SALT", "SAME", "SAND",
			"SAVE", "SEAT", "SEED", "SEEM", "SELL", "SEND", "SHIP", "SHOE", "SHOP",
			"SHOT", "SHOW", "SHUT", "SICK", "SIDE", "SIGN", "SILK", "SING", "SINK",
			"SIZE", "SKIN", "SLIP", "SLOW", "SNOW", "SOAP", "SOCK", "SOFT", "SOIL",
			"SOME", "SONG", "SOON", "SORE", "SORT", "SOUL", "SOUP", "SOUR", "SPIN",
			"SPOT", "STAR", "STAY", "STEM", "STEP", "STOP", "SUCH", "SUCK", "SUIT",
			"SURE", "SWIM", "TAIL", "TAKE", "TALK", "TALL", "TAXI", "TEAM", "TEAR",
			"TEAR", "TELL", "TEND", "TENT", "TEST", "THAN", "THAT", "THEM", "THEN",
			"THEY", "THIN", "THIS", "THUS", "TIDY", "TIME", "TIRE", "TIRE", "TOOL",
			"TOUR", "TOWN", "TRAP", "TREE", "TRIP", "TRUE", "TUBE", "TUNE", "TURN",
			"TYPE", "UGLY", "UNDO", "UNIT", "DOWN", "URGE", "VARY", "VERB", "VERY",
			"VIEW", "VOTE", "WAIT", "WAKE", "WALK", "WALL", "WANT", "WARM", "WARN",
			"WASH", "WAVE", "WEAK", "WEAR", "WEEK", "WELL", "WEST", "WHAT", "WHEN",
			"WHIP", "WIDE", "WIFE", "WILD", "WILL", "WIND", "WIND", "WINE", "WING",
			"WIRE", "WISE", "WISH", "WITH", "WOOD", "WOOL", "WORD", "WORK", "WORM",
			"WRAP", "YARD", "YEAR", "YOUR", "ZERO", "ABOUT", "ABOVE", "ACTOR", "ADMIT",
			"ADULT", "AFTER", "AGAIN", "AGREE", "AHEAD", "ALIKE", "ALIVE", "ALLOW",
			"ALONE", "ALONG", "ALOUD", "AMONG", "AMUSE", "ANGER", "ANGLE", "ANGRY",
			"ANKLE", "ANNOY", "APART", "APPLE", "ARGUE", "ARMOR", "ASIDE", "AVOID",
			"AWAKE", "BATHE", "BEARD", "BEGIN", "BELOW", "BERRY", "BIRTH", "BLACK",
			"BLADE", "BLAME", "BLEED", "BLESS", "BLIND", "BLOCK", "BLOOD", "BOARD",
			"BRAIN", "BRASS", "BRAVE", "BREAD", "BREAK", "BREED", "BRICK", "BRING",
			"BROAD", "BROWN", "BRUSH", "BUILD", "BUNCH", "BURST", "CARRY", "CATCH",
			"CAUSE", "CHAIN", "CHAIR", "CHALK", "CHARM", "CHASE", "CHEAP", "CHEAT",
			"CHECK", "CHEEK", "CHEER", "CHEST", "CHIEF", "CHILD", "CLAIM", "CLASS",
			"CLEAN", "CLEAR", "CLERK", "CLIFF", "CLIMB", "CLOCK", "CLOSE", "CLOTH",
			"CLOUD", "COAST", "COLOR", "COUGH", "COULD", "COUNT", "COURT", "COVER",
			"CRACK", "CRASH", "CREAM", "CREEP", "CRIME", "CROSS", "CROWD", "CRUEL",
			"CRUSH", "CURSE", "CURVE", "CYCLE", "DAILY", "DANCE", "DEATH", "DECAY",
			"DELAY", "DEPTH", "DEVIL", "DIRTY", "DITCH", "DOUBT", "DREAM", "DRESS",
			"DRINK", "DRIVE", "DROWN", "DRUNK", "EAGER", "EARLY", "EARTH", "EIGHT",
			"ELBOW", "ELECT", "EMPTY", "ENEMY", "ENJOY", "ENTER", "EQUAL", "EVENT",
			"EVERY", "EXACT", "EXIST", "FAINT", "FAIRY", "FAITH", "FALSE", "FANCY",
			"FAULT", "FAVOR", "FENCE", "FEVER", "FIELD", "FIFTH", "FIGHT", "FIRST",
			"FLAME", "FLASH", "FLESH", "FLOAT", "FLOOD", "FLOOR", "FLOUR", "FORCE",
			"FRAME", "FRESH", "FRONT", "FRUIT", "FUNNY", "GLASS", "GLORY", "GOODS",
			"GRACE", "GRAIN", "GRAND", "GRASS", "GRAVE", "GREAT", "GREEN", "GREET",
			"GRIEF", "GROUP", "GUARD", "GUESS", "GUEST", "GUIDE", "GUILT", "HABIT",
			"HAIRY", "HAPPY", "HASTY", "HEART", "HEAVY", "HONOR", "HORSE", "HOTEL",
			"HOUSE", "HUMAN", "HUMOR", "HURRY", "IMAGE", "INNER", "JELLY", "JEWEL",
			"JOINT", "JUDGE", "JUICE", "KNEEL", "KNIFE", "KNOCK", "LABOR", "LARGE",
			"LAUGH", "LEARN", "LEAST", "LEAVE", "LEGAL", "LEVEL", "LIGHT", "LIMIT",
			"LITER", "LOCAL", "LOOSE", "LOWER", "LOYAL", "MAGIC", "MARCH", "MARRY",
			"MATCH", "MEANS", "MERRY", "METAL", "METER", "MIGHT", "MODEL", "MONEY",
			"MONTH", "MORAL", "MOTOR", "MOUSE", "MOUTH", "MUSIC", "NASTY", "NAVAL",
			"NERVE", "NEVER", "NIGHT", "NINTH", "NOBLE", "NOISE", "NORTH", "NURSE",
			"NYLON", "OCEAN", "OFFER", "OFTEN", "ONION", "ORDER", "ORGAN", "OTHER",
			"OUGHT", "OUTER", "OWING", "PAINT", "PAPER", "PARTY", "PAUSE", "PEACE",
			"PENCE", "PIANO", "PIECE", "PILOT", "PLACE", "PLAIN", "PLANE", "PLANT",
			"PLATE", "POINT", "POUND", "POWER", "PRESS", "PRICE", "PRIDE", "PRINT",
			"PRIZE", "PROOF", "PROUD", "PROVE", "PUPIL", "QUEEN", "QUICK", "QUIET",
			"QUITE", "RADIO", "RAISE", "RANGE", "RAPID", "REACH", "READY", "REPLY",
			"RIGHT", "RIVER", "ROUGH", "ROUND", "ROYAL", "RULER", "SCALE", "SCENE",
			"SCREW", "SEIZE", "SENSE", "SERVE", "SEVEN", "SHADE", "SHAKE", "SHALL",
			"SHAME", "SHAPE", "SHARE", "SHARP", "SHEEP", "SHEET", "SHELF", "SHELL",
			"SHINE", "SHIRT", "SHOCK", "SHOOT", "SHORE", "SHORT", "SHOUT", "SIGHT",
			"SILLY", "SINCE", "SIXTH", "SKILL", "SKIRT", "SLAVE", "SLEEP", "SLIDE",
			"SLOPE", "SMALL", "SMELL", "SMILE", "SMOKE", "SNAKE", "SOLID", "SORRY",
			"SOUND", "SOUTH", "SPACE", "SPADE", "SPEAK", "SPEAR", "SPEED", "SPELL",
			"SPEND", "SPITE", "SPLIT", "SPOIL", "SPOON", "SPORT", "STAGE", "STAIR",
			"STAMP", "STAND", "START", "STATE", "STEAL", "STEAM", "STEEL", "STEEP",
			"STICK", "STIFF", "STILL", "STING", "STONE", "STORE", "STORM", "STORY",
			"STUDY", "STYLE", "SUGAR", "SWEAR", "SWEEP", "SWEET", "SWELL", "SWING",
			"SWORD", "TABLE", "TASTE", "TEACH", "TENSE", "THANK", "THEIR", "THERE",
			"THESE", "THICK", "THIEF","THING" , "THINK", "THIRD", "THOSE", "THREE", 
			"THROW", "THUMB", "TIGER", "TIGHT", "TITLE", "TODAY", "TOOTH", "TOTAL",
			"TOUCH", "TOWER", "TRACK", "TRADE", "TRAIN", "TREAT", "TRIBE", "TRICK",
			"TRUNK", "TRUST", "TRUTH", "TWICE", "TWIST", "UNCLE", "UNDER", "UNION",
			"UNITE", "UNTIL", "UPPER", "UPSET", "USUAL", "VALUE", "VISIT", "VOICE",
			"VOWEL", "WAGES", "WAIST", "WASTE", "WATCH", "WATER", "WEAVE", "WEIGH",
			"WHEAT", "WHEEL", "WHERE", "WHICH", "WHILE", "WHITE", "WHOLE", "WIDTH",
			"WOMAN", "WORLD", "WORRY", "WORSE", "WORST", "WORTH", "WOULD", "WOUND",
			"WRECK", "WRIST", "WRITE", "WRONG", "YOUNG", "YOURS", "YOUTH", "ABROAD",
			"ABSENT", "ACCEPT", "ACROSS", "ACTION", "ACTIVE", "ACTUAL", "ADMIRE",
			"ADVERB", "ADVICE", "ADVISE", "AFFAIR", "AFFORD", "AFRAID", "ALMOST",
			"ALWAYS", "AMOUNT", "ANIMAL", "ANSWER", "ANYHOW", "ANYONE", "APPEAR",
			"AROUND", "ARRIVE", "ASLEEP", "ATTACK", "ATTEND", "AUTUMN", "BANANA",
			"BARREL", "BASKET", "BATTLE", "BEAUTY", "BECOME", "BEFORE", "BEHAVE",
			"BEHIND", "BELIEF", "BELONG", "BESIDE", "BETTER", "BEYOND", "BITTER",
			"BORDER", "BORROW", "BOTTLE", "BOTTOM", "BOWELS", "BRANCH", "BREAST",
			"BREATH", "BRIDGE", "BRIGHT", "BUCKET", "BULLET", "BURIAL", "BUTTER",
			"BUTTON", "CAMERA", "CANDLE", "CASTLE", "CATTLE", "CEMENT", "CENTER",
			"CHANCE", "CHANGE", "CHARGE", "CHEESE", "CHOICE", "CHOOSE", "CHURCH",
			"CINEMA", "CIRCLE", "CLEVER", "COFFEE", "COLLAR", "COMMON", "COPPER",
			"CORNER", "COTTON", "COURSE", "COWARD", "CUSTOM", "DAMAGE", "DANGER",
			"DARING", "DECEIT", "DECIDE", "DEFEAT", "DEFEND", "DEGREE", "DEMAND",
			"DEPEND", "DESERT", "DESIRE", "DETAIL", "DINNER", "DIRECT", "DIVIDE",
			"DOCTOR", "DOLLAR", "DOUBLE", "DRAWER", "DURING", "EFFECT", "EFFORT",
			"EIGHTH", "EITHER", "EMPLOY", "ENGINE", "ENOUGH", "ESCAPE", "EXCEPT",
			"EXCITE", "EXCUSE", "EXPECT", "EYELID", "FAMILY", "FAMOUS", "FARMER",
			"FASTEN", "FATHER", "FELLOW", "FEMALE", "FIERCE", "FIGURE", "FINGER",
			"FINISH", "FLIGHT", "FLOWER", "FOLLOW", "FORBID", "FOREST", "FORGET",
			"FORMAL", "FORMER", "FOURTH", "FREEZE", "FRIEND", "FUTURE", "GARAGE",
			"GARDEN", "GATHER", "GENTLE", "GOLDEN", "GOVERN", "GRIEVE", "GROUND",
			"GROWTH", "HAMMER", "HANDLE", "HAPPEN", "HARDEN", "HARDLY", "HATRED",
			"HEALTH", "HEAVEN", "HEIGHT", "HOLLOW", "HONEST", "HOURLY", "HUNGER",
			"HUNGRY", "INCOME", "INDOOR", "INFECT", "INFORM", "INSECT", "INSIDE",
			"INSURE", "INTEND", "INVENT", "INVITE", "ISLAND", "ITSELF", "LADDER",
			"LATELY", "LAWYER", "LENGTH", "LESSON", "LETTER", "LIKELY", "LIQUID",
			"LISTEN", "LITTLE", "LONELY", "MANAGE", "MANNER", "MARKET", "MASTER",
			"MATTER", "MEMBER", "MEMORY", "METHOD", "METRIC", "MIDDLE", "MINUTE",
			"MIRROR", "MODERN", "MOMENT", "MONKEY", "MORALS", "MOTHER", "MURDER",
			"MUSCLE", "MYSELF", "NARROW", "NATION", "NATURE", "NEARLY", "NEEDLE",
			"NOTICE", "NUMBER", "OBJECT", "OBTAIN", "OFFEND", "OFFICE", "OPPOSE",
			"ORANGE", "ORIGIN", "OXYGEN", "PACKET", "PALACE", "PARCEL", "PARENT",
			"PASTRY", "PENCIL", "PEOPLE", "PEPPER", "PERIOD", "PERMIT", "PERSON",
			"PHRASE", "PLEASE", "PLENTY", "PLURAL", "POCKET", "POETRY", "POISON",
			"POLICE", "POLISH", "POLITE", "POTATO", "POWDER", "PRAISE", "PRAYER",
			"PRETTY", "PRIEST", "PRINCE", "PRISON", "PROFIT", "PROPER", "PUBLIC",
			"PUNISH", "PURPLE", "RABBIT", "RATHER", "REALLY", "REASON", "RECENT",
			"RECORD", "REDUCE", "REFUSE", "REGARD", "REMAIN", "REMARK", "REMIND",
			"REMOVE", "REPAIR", "REPEAT", "REPORT", "RESULT", "RETURN", "REWARD",
			"RUBBER", "SAFETY", "SCHOOL", "SEARCH", "SEASON", "SECOND", "SECRET",
			"SETTLE", "SEVERE", "SEXUAL", "SHADOW", "SHIELD", "SHOULD", "SIGNAL",
			"SILENT", "SILVER", "SIMPLE", "SINGLE", "SISTER", "SLIGHT", "SMOOTH",
			"SOCIAL", "SOLEMN", "SORROW", "SPEECH", "SPIRIT", "SPREAD", "SPRING",
			"SQUARE", "STEADY", "STICKY", "STITCH", "STREAM", "STREET", "STRIKE",
			"STRING", "STROKE", "STRONG", "STUPID", "SUDDEN", "SUFFER", "SUMMER",
			"SUPPER", "SUPPLY", "SYSTEM", "TEMPER", "TEMPLE", "TENDER", "TENNIS",
			"TERROR", "THEIRS", "THIRST", "THOUGH", "THREAD", "THREAT", "THROAT",
			"TICKET", "TONGUE", "TRAVEL", "UPSIDE", "URGENT", "USEFUL", "VALLEY",
			"VOYAGE", "WAITER", "WANDER", "WARMTH", "WEALTH", "WEAPON", "WEEKLY",
			"WEIGHT", "WICKED", "WINDOW", "WINTER", "WISDOM", "WITHIN", "WONDER",
			"WOODEN", "WOOLEN", "WORTHY", "YEARLY", "YELLOW"};
	private String text = "", typedText = "", backUpText = "";
	private final int[] CHALARGE = {9, 10, 11, 11, 10, 9, 11, 11, 3, 7, 10,
			8, 12, 11, 11, 10, 11, 11, 10, 9, 11, 9, 15, 9, 9, 9};
	private int xPosition = 0, yPosition = 0, typedTextLarge = 0;
	
	public int getTypedTextLarge() {
		return typedTextLarge;
	}
	public void setTypedTextLarge(int typeTextLarge) {
		this.typedTextLarge = typeTextLarge;
	}
	public String getBackUpText() {
		return backUpText;
	}
	public void setBackUpText(String backUpText) {
		this.backUpText = backUpText;
	}
	public int getxPosition() {
		return xPosition;
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public int getyPosition() {
		return yPosition;
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	public String getTypedText() {
		return typedText;
	}
	public void setTypedText(String typedText) {
		this.typedText = typedText;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String[] getTextList() {
		return textList;
	}
	public void setTextList(String[] textList) {
		this.textList = textList;
	}
	public void randomNewText() {
		Random ran = new Random();
		do {
			int index = ran.nextInt(textList.length), xPos = ran.nextInt(850);
			text = textList[index];
			xPosition =  xPos + 50;
		} while (text == backUpText);
		backUpText = text;
		typedText = "";
		typedTextLarge = 0;
		
		yPosition = 20;
	}
	public void correctType() {
		ArrayList<String> list = new ArrayList<String>();
		for (char cha: text.toCharArray()){
			String s = "" + cha;
			list.add(s);
		}
		typedText += list.get(0);
		typedTextLarge += CHALARGE[(int) list.get(0).charAt(0) - 65];
		list.remove(0);
		String remainingText = "";
		for (String s : list)
		{
			remainingText += s;
		}
		text = remainingText;
	}
	public void incorrectType() {
		text = backUpText;
		typedText = "";
		typedTextLarge = 0;
	}
	public char getFirstChar() {
		char[] cha = text.toCharArray();
		return cha[0];
	}
	public Boolean isFinish() {
		if (text == "") {
			return true;
		} else {
			return false;
		}
	}
	public void movingY(int num) {
		yPosition += num;
	}
}
