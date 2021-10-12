package dicegame;

import java.util.List;

public class TurnResult {

    private final String name;
    private final List<ThrowResult> throwResults;

    public TurnResult(String name, List<ThrowResult> throwResults) {
        this.name = name;
        this.throwResults = throwResults;
    }

    public void add(ThrowResult throwResult) {
        throwResults.add(throwResult);
    }

    public String getName() {
        return name;
    }

    public List<ThrowResult> getThrowResults() {
        return throwResults;
    }
}
