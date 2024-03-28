package week3;

public class KoreanChar {
    public static void main(String[] args) {
        int start = 0xAC00; // '가'의 유니코드 코드 포인트
        int end = 0xD7A3;   // '힣'의 유니코드 코드 포인트
        int current = start;
        boolean isFirst = true;

        do {
            if (!isFirst && isChanged(current)) {
                System.out.print("\n--...--\n");
            }
            System.out.print((char)current);
            isFirst = false;
            current++;
        } while (current <= end);
    }

    private static boolean isChanged(int current) {
        int preNum = (current - 0xAC00) / 28 / 21; // 초성 인덱스 계산
        int nextNum = ((current+1) - 0xAC00) / 28 / 21; // 다음 문자의 초성 인덱스 계산
        return preNum != nextNum;

    }
}

