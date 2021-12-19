package com.p2082ss.android.ugc.aweme.services.external.ability.p3711qr;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigma */
public class AVEnigma {
    AVTdPoint[] points;
    String text;
    int type;

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigma$CodeType */
    public interface CodeType {
        static {
            Covode.recordClassIndex(79843);
        }
    }

    static {
        Covode.recordClassIndex(79842);
    }

    public AVTdPoint[] getPoints() {
        return this.points;
    }

    public String getText() {
        return this.text;
    }

    public int getType() {
        return this.type;
    }

    public void setPoints(AVTdPoint[] aVTdPointArr) {
        this.points = aVTdPointArr;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
