public static void main(String[] args) {

    stringaPariDispari("edinson");
    annoBisestile(2024);
}

public static void stringaPariDispari (String stringa) {
    if (stringa.length() % 2 == 0) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }
}

public static void annoBisestile (int anno) {

    if (anno % 4 == 0) {
        if (anno % 100 == 0) {
            if (anno % 400 == 0) {
                System.out.println("true:" + anno + " è bisestile");
            } else {
                System.out.println("false: è divisibile per 4 e 100 ma non per 400");
            }
        } else {
            System.out.println("true: però " + anno + " non è divisibile per 100");
        }
    } else {
        System.out.println("false: non è divisibile per 4");
    }
}

