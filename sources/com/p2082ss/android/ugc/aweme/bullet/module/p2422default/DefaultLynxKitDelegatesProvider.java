package com.p2082ss.android.ugc.aweme.bullet.module.p2422default;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16370a;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16387b;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16405c;
import com.bytedance.ies.bullet.kit.lynx.p1153b.C16389b;
import com.bytedance.ies.bullet.kit.lynx.p1154c.AbstractC16406a;
import com.bytedance.ies.bullet.kit.lynx.p1154c.AbstractC16407b;
import com.bytedance.ies.bullet.kit.lynx.p1154c.AbstractC16408c;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.xelement.AbstractC19055d;
import com.bytedance.ies.xelement.C19294m;
import com.bytedance.ies.xelement.C19296n;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.lynx.tasm.behavior.C28463a;
import com.p2082ss.android.ugc.aweme.components.video.playbox.LynxDeclarativeVideoPlayBox;
import com.p2082ss.android.ugc.aweme.p2685cp.p2687b.C40253c;
import java.util.List;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider */
public final class DefaultLynxKitDelegatesProvider implements AbstractC16405c {

    /* renamed from: a */
    public static final C35234a f83248a = new C35234a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider$LynxApi */
    public interface LynxApi {
        static {
            Covode.recordClassIndex(42398);
        }

        @AbstractC22000h
        AbstractC21983b<String> getDebugUrlData(@AbstractC21993ag String str);

        @AbstractC22000h
        @AbstractC21991ae
        AbstractC21983b<TypedInput> getUrlStream(@AbstractC21993ag String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider$a */
    public static final class C35234a {
        static {
            Covode.recordClassIndex(42399);
        }

        private C35234a() {
        }

        public /* synthetic */ C35234a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider$c */
    public static final class C35236c implements AbstractC16370a {
        static {
            Covode.recordClassIndex(42401);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
        /* renamed from: a */
        public final void mo25953a(AbstractC16387b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
        /* renamed from: a */
        public final void mo25954a(AbstractC16387b bVar, Context context, AbstractC89183m<Object, ? super Throwable, C89391z> mVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(context, "");
            C89219l.m154721d(mVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
        /* renamed from: a */
        public final void mo25955a(AbstractC16387b bVar, C16389b bVar2) {
            C89219l.m154721d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
        /* renamed from: a */
        public final void mo25956a(AbstractC16387b bVar, String str) {
            C89219l.m154721d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
        /* renamed from: a */
        public final void mo25957a(AbstractC16387b bVar, JSONObject jSONObject) {
            C89219l.m154721d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
        /* renamed from: b */
        public final void mo25958b(AbstractC16387b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
        /* renamed from: c */
        public final void mo25959c(AbstractC16387b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
        /* renamed from: d */
        public final void mo25960d(AbstractC16387b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
        /* renamed from: e */
        public final void mo25961e(AbstractC16387b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
        /* renamed from: f */
        public final void mo25962f(AbstractC16387b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C35236c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider$e */
    public static final class C35238e implements AbstractC16406a {
        static {
            Covode.recordClassIndex(42403);
        }

        C35238e() {
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.p1154c.AbstractC16406a
        /* renamed from: a */
        public final List<C28463a> mo26038a() {
            return C40253c.m81398a(false);
        }
    }

    static {
        Covode.recordClassIndex(42397);
        C19296n.C19297a.m36033a().mo30715a(new C19294m.C19295a().mo30713a(C35235b.f83249a).mo30714a());
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider$b */
    static final class C35235b extends AbstractC89220m implements AbstractC89172b<Context, AbstractC19055d> {

        /* renamed from: a */
        public static final C35235b f83249a = new C35235b();

        static {
            Covode.recordClassIndex(42400);
        }

        C35235b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC19055d invoke(Context context) {
            Context context2 = context;
            C89219l.m154721d(context2, "");
            return new LynxDeclarativeVideoPlayBox(context2, (byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider$d */
    public static final class C35237d implements AbstractC16210j {

        /* renamed from: a */
        final /* synthetic */ DefaultLynxKitDelegatesProvider f83250a;

        /* renamed from: b */
        final /* synthetic */ C16248b f83251b;

        /* renamed from: c */
        private AbstractC88412b f83252c;

        static {
            Covode.recordClassIndex(42402);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j
        /* renamed from: a */
        public final void mo25781a(AbstractC16208i iVar) {
            C89219l.m154721d(iVar, "");
            AbstractC16210j.C16211a.m30127a(iVar);
        }

        C35237d(DefaultLynxKitDelegatesProvider defaultLynxKitDelegatesProvider, C16248b bVar) {
            this.f83250a = defaultLynxKitDelegatesProvider;
            this.f83251b = bVar;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j
        /* renamed from: a */
        public final void mo25782a(AbstractC16208i iVar, Uri uri) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(uri, "");
            this.f83252c = null;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j
        /* renamed from: a */
        public final void mo25784a(AbstractC16208i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            AbstractC16210j.C16211a.m30130b(iVar);
            AbstractC88412b bVar = this.f83252c;
            if (bVar != null) {
                bVar.dispose();
            }
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j
        /* renamed from: a */
        public final void mo25783a(AbstractC16208i iVar, Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(bVar2, "");
            AbstractC16210j.C16211a.m30129a(iVar, uri, bVar, bVar2);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16204e
    /* renamed from: a */
    public final AbstractC16210j mo25653a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35237d(this, bVar);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16405c
    /* renamed from: b */
    public final AbstractC16370a mo26033b(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35236c();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16405c
    /* renamed from: c */
    public final AbstractC16406a mo26034c(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35238e();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16405c
    /* renamed from: d */
    public final AbstractC16406a mo26035d(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154719c(bVar, "");
        return null;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16405c
    /* renamed from: e */
    public final AbstractC16407b mo26036e(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154719c(bVar, "");
        return null;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16405c
    /* renamed from: f */
    public final AbstractC16408c mo26037f(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154719c(bVar, "");
        return null;
    }
}
