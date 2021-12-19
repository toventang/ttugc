package com.p2082ss.android.ugc.aweme.choosemusic.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.an */
public final class C35894an implements Serializable {
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: a */
    private String f84713a;
    @AbstractC27891c(mo46611a = "pos")

    /* renamed from: b */
    private List<? extends Position> f84714b;
    @AbstractC27891c(mo46611a = "highlight_pos")

    /* renamed from: c */
    private final List<Position> f84715c;
    @AbstractC27891c(mo46611a = "word_record")

    /* renamed from: d */
    private C35898ar f84716d;

    /* renamed from: e */
    private Map<String, String> f84717e;

    /* renamed from: f */
    private boolean f84718f;
    @AbstractC27891c(mo46611a = "sug_type")

    /* renamed from: g */
    private final String f84719g;

    static {
        Covode.recordClassIndex(43134);
    }

    public final String getContent() {
        return this.f84713a;
    }

    public final Map<String, String> getExtraParam() {
        return this.f84717e;
    }

    public final List<Position> getHignLightPositions() {
        return this.f84715c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Position>, java.util.List<com.ss.android.ugc.aweme.discover.model.Position> */
    public final List<Position> getPosition() {
        return this.f84714b;
    }

    public final String getSugType() {
        return this.f84719g;
    }

    public final C35898ar getWordRecord() {
        return this.f84716d;
    }

    public final boolean isMobShow() {
        return this.f84718f;
    }

    public final boolean isHistoryType() {
        return TextUtils.equals(this.f84719g, "history");
    }

    public final void setContent(String str) {
        this.f84713a = str;
    }

    public final void setExtraParam(Map<String, String> map) {
        this.f84717e = map;
    }

    public final void setMobShow(boolean z) {
        this.f84718f = z;
    }

    public final void setPosition(List<? extends Position> list) {
        this.f84714b = list;
    }

    public final void setWordRecord(C35898ar arVar) {
        this.f84716d = arVar;
    }
}
