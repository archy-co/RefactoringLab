package user;

class Main {
    public static void main(String [] agrv) {
        User user = User.builder()
                .firstName("Archy")
                .lastName("Revera")
                .weight(66)
                .height(188)
                .build();
        System.out.println(user.getGender());
    }
}
