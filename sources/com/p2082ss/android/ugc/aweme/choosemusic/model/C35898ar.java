package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.ar */
public final class C35898ar implements Serializable {
    @AbstractC27891c(mo46611a = "id", mo46612b = {"group_id"})

    /* renamed from: a */
    private String f84722a;
    @AbstractC27891c(mo46611a = "word", mo46612b = {"words_content"})

    /* renamed from: b */
    private String f84723b;
    @AbstractC27891c(mo46611a = "params")

    /* renamed from: c */
    private C35892al f84724c;
    @AbstractC27891c(mo46611a = "words_position")

    /* renamed from: d */
    private int f84725d;
    @AbstractC27891c(mo46611a = "words_source")

    /* renamed from: e */
    private String f84726e;

    /* renamed from: f */
    private boolean f84727f;

    static {
        Covode.recordClassIndex(43138);
    }

    public final String getId() {
        return this.f84722a;
    }

    public final C35892al getParams() {
        return this.f84724c;
    }

    public final String getWord() {
        return this.f84723b;
    }

    public final int getWordPosition() {
        return this.f84725d;
    }

    public final String getWordSource() {
        return this.f84726e;
    }

    public final boolean isShowed() {
        return this.f84727f;
    }

    public final int hashCode() {
        String str = this.f84723b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setId(String str) {
        this.f84722a = str;
    }

    public final void setParams(C35892al alVar) {
        this.f84724c = alVar;
    }

    public final void setShowed(boolean z) {
        this.f84727f = z;
    }

    public final void setWord(String str) {
        this.f84723b = str;
    }

    public final void setWordPosition(int i) {
        this.f84725d = i;
    }

    public final void setWordSource(String str) {
        this.f84726e = str;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.model.Word");
        if (!C89219l.m154714a((Object) this.f84723b, (Object) ((C35898ar) obj).f84723b)) {
            return false;
        }
        return true;
    }
}
