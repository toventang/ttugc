package com.p2082ss.android.ugc.aweme.search.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.search.model.e */
public class C67679e {
    @AbstractC27891c(mo46611a = "sug_type")

    /* renamed from: a */
    public String f151666a;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: b */
    public String f151667b;
    @AbstractC27891c(mo46611a = "pos")

    /* renamed from: c */
    public List<Position> f151668c;
    @AbstractC27891c(mo46611a = "highlight_pos")

    /* renamed from: d */
    public List<Position> f151669d;
    @AbstractC27891c(mo46611a = "rich_sug_sec_pos")

    /* renamed from: e */
    public List<Position> f151670e;
    @AbstractC27891c(mo46611a = "word_record")

    /* renamed from: f */
    public Word f151671f;
    @AbstractC27891c(mo46611a = "extra_info")

    /* renamed from: g */
    public C67684i f151672g;

    /* renamed from: h */
    public transient int f151673h;

    /* renamed from: i */
    public transient int f151674i = -1;

    /* renamed from: j */
    public boolean f151675j;

    /* renamed from: k */
    public Map<String, String> f151676k;

    static {
        Covode.recordClassIndex(79324);
    }

    /* renamed from: b */
    public final boolean mo106741b() {
        return TextUtils.equals(this.f151666a, "history");
    }

    /* renamed from: a */
    public final boolean mo106740a() {
        C67684i iVar = this.f151672g;
        if (iVar == null) {
            return false;
        }
        return "2".equals(iVar.getWordsType());
    }
}
