package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo */
public class QueryCorrectInfo implements Serializable {
    static final long serialVersionUID = 1;
    @AbstractC27891c(mo46611a = "correct_highlight_position")
    CorrectHighlightPositions correctHighlightPositions;
    @AbstractC27891c(mo46611a = "corrected_query")
    String correctedKeyword;
    @AbstractC27891c(mo46611a = "correct_level")
    int correctedLevel;
    private String requestId;

    static {
        Covode.recordClassIndex(50473);
    }

    public CorrectHighlightPositions getCorrectHighlightPosition() {
        return this.correctHighlightPositions;
    }

    public String getCorrectedKeyword() {
        return this.correctedKeyword;
    }

    public int getCorrectedLevel() {
        return this.correctedLevel;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean isCorrectHighArrayAvailable() {
        CorrectHighlightPositions correctHighlightPositions2 = this.correctHighlightPositions;
        if (correctHighlightPositions2 == null || !correctHighlightPositions2.hasHighlightPosition()) {
            return false;
        }
        return true;
    }

    public void setCorrectHighlightPosition(CorrectHighlightPositions correctHighlightPositions2) {
        this.correctHighlightPositions = correctHighlightPositions2;
    }

    public void setCorrectedKeyword(String str) {
        this.correctedKeyword = str;
    }

    public void setCorrectedLevel(int i) {
        this.correctedLevel = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
