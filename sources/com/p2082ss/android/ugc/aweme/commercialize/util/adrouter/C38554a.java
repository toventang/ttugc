package com.p2082ss.android.ugc.aweme.commercialize.util.adrouter;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AdRouterHandlerDependImpl;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.AbstractC38555a;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.a */
public final class C38554a implements IAdRouterHandlerDepend {

    /* renamed from: a */
    public static final C38554a f91082a = new C38554a();

    /* renamed from: b */
    private final /* synthetic */ IAdRouterHandlerDepend f91083b;

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: a */
    public final String mo65600a() {
        return this.f91083b.mo65600a();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: a */
    public final void mo65601a(AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f91083b.mo65601a(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: a */
    public final void mo65602a(String str) {
        C89219l.m154721d(str, "");
        this.f91083b.mo65602a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: a */
    public final void mo65603a(String str, JSONObject jSONObject, String str2, String str3) {
        C89219l.m154721d(str, "");
        this.f91083b.mo65603a(str, jSONObject, str2, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: a */
    public final boolean mo65604a(Context context, String str, Uri uri, C38565b bVar) {
        C89219l.m154721d(context, "");
        return this.f91083b.mo65604a(context, str, uri, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: a */
    public final boolean mo65605a(Context context, String str, String str2) {
        return this.f91083b.mo65605a(context, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: b */
    public final AbstractC38555a mo65606b(AbstractC89172b<? super Boolean, C89391z> bVar) {
        return this.f91083b.mo65606b(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: b */
    public final boolean mo65607b(String str) {
        C89219l.m154721d(str, "");
        return this.f91083b.mo65607b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: c */
    public final AbstractC38555a mo65608c(AbstractC89172b<? super Boolean, C89391z> bVar) {
        return this.f91083b.mo65608c(bVar);
    }

    static {
        Covode.recordClassIndex(46086);
    }

    private C38554a() {
        IAdRouterHandlerDepend b = AdRouterHandlerDependImpl.m75926b();
        C89219l.m154716b(b, "");
        this.f91083b = b;
    }
}
