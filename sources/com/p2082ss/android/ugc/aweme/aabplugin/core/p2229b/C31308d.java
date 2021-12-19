package com.p2082ss.android.ugc.aweme.aabplugin.core.p2229b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18115a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31344p;
import java.util.Locale;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.b.d */
public final class C31308d extends AbstractC31339n {

    /* renamed from: q */
    public final Locale f75022q;

    static {
        Covode.recordClassIndex(38008);
    }

    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n
    /* renamed from: b */
    public final boolean mo57311b() {
        return true;
    }

    /* renamed from: e */
    public final String mo57312e() {
        String language = this.f75022q.getLanguage();
        C89219l.m154716b(language, "");
        return language;
    }

    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n
    /* renamed from: a */
    public final void mo57308a(Map<String, String> map) {
        C89219l.m154721d(map, "");
        map.put(StringSet.name, "df_language");
        String language = this.f75022q.getLanguage();
        C89219l.m154716b(language, "");
        map.put("language", language);
    }

    public /* synthetic */ C31308d(Locale locale, boolean z, AbstractC31344p pVar, C18115a aVar) {
        this(locale, z, false, pVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31308d(Locale locale, boolean z, boolean z2, AbstractC31344p pVar, C18115a aVar) {
        super("df_language_" + locale.getLanguage(), "com.ss.android.ugc.aweme.dflanguage", z, z2, pVar, aVar);
        C89219l.m154721d(locale, "");
        C89219l.m154721d(aVar, "");
        this.f75022q = locale;
    }
}
