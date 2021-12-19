package com.p2082ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.Word */
public final class Word implements Serializable {
    @AbstractC27891c(mo46611a = "id", mo46612b = {"group_id"})

    /* renamed from: id */
    private String f99019id;
    private String implId;
    private boolean isShowed;
    @AbstractC27891c(mo46611a = "show_word")
    private String showWord;
    @AbstractC27891c(mo46611a = "type_image")
    private UrlModel typeImage;
    @AbstractC27891c(mo46611a = "word", mo46612b = {"words_content"})
    private String word;
    @AbstractC27891c(mo46611a = "words_position")
    private int wordPosition;
    @AbstractC27891c(mo46611a = "words_source")
    private String wordSource;
    @AbstractC27891c(mo46611a = "words_type")
    private String wordType;

    static {
        Covode.recordClassIndex(50549);
    }

    public Word() {
    }

    public final String getId() {
        return this.f99019id;
    }

    public final String getImplId() {
        return this.implId;
    }

    public final String getShowWord() {
        return this.showWord;
    }

    public final UrlModel getTypeImage() {
        return this.typeImage;
    }

    public final String getWord() {
        return this.word;
    }

    public final int getWordPosition() {
        return this.wordPosition;
    }

    public final String getWordSource() {
        return this.wordSource;
    }

    public final String getWordType() {
        return this.wordType;
    }

    public final boolean isShowed() {
        return this.isShowed;
    }

    public final int hashCode() {
        String str = this.word;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setId(String str) {
        this.f99019id = str;
    }

    public final void setImplId(String str) {
        this.implId = str;
    }

    public final void setShowWord(String str) {
        this.showWord = str;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    public final void setTypeImage(UrlModel urlModel) {
        this.typeImage = urlModel;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public final void setWordPosition(int i) {
        this.wordPosition = i;
    }

    public final void setWordSource(String str) {
        this.wordSource = str;
    }

    public final void setWordType(String str) {
        this.wordType = str;
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
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.Word");
        if (!C89219l.m154714a((Object) this.word, (Object) ((Word) obj).word)) {
            return false;
        }
        return true;
    }

    public Word(String str, String str2) {
        this.f99019id = str;
        this.word = str2;
    }
}
