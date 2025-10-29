package tetris.game;

/**
 * 테트리스 게임의 아이템 타입을 정의하는 enum
 */
public enum ItemType {
    /**
     * 아이템이 없는 일반 블록
     */
    NONE,

    /**
     * 줄 삭제 아이템 (Line Clear)
     * 블록이 착지할 때 'L'이 위치한 가로 줄을 즉시 삭제
     */
    LINE_CLEAR,

    /**
     * 무게추 아이템 (Weight)
     * 블록이 떨어지면서 자신의 바로 밑에 있는 모든 블록들을 지움
     * 한 번 착지하면 더 이상 좌우 이동 불가
     */
    WEIGHT,

    /**
     * 점수 2배 아이템 (Double Score)
     * 블록이 착지할 때 발동되어 30초 동안 모든 점수가 2배
     */
    DOUBLE_SCORE,

    /**
     * 폭탄 아이템 (Bomb)
     * 1x1 단일 블록, '+' 표시
     * 블록이 착지할 때 폭탄이 위치한 행과 열 전체를 십자가(+) 모양으로 삭제
     */
    BOMB,

    /**
     * 블록 넘기기 아이템 (Skip)
     * NEXT에 등장했을 때 N키를 누르면 현재 블록을 버리고 다음 블록을 가져옴
     * 다음 블록은 현재 블록과 반드시 달라야 함
     */
    SKIP;

    /**
     * 아이템 타입의 표시 문자를 반환
     * @return LINE_CLEAR의 경우 'L', WEIGHT의 경우 'W', DOUBLE_SCORE의 경우 'D', BOMB의 경우 'B', SKIP의 경우 'S', 그 외는 빈 문자열
     */
    public String getDisplayChar() {
        switch (this) {
            case LINE_CLEAR:
                return "L";
            case WEIGHT:
                return "W";
            case DOUBLE_SCORE:
                return "D";
            case BOMB:
                return "+";
            case SKIP:
                return "S";
            default:
                return "";
        }
    }
}
