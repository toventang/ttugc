package com.p2082ss.android.ugc.aweme.hybridkit.bridge;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.AbstractC16253f;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.e */
public abstract class AbstractC53418e implements AbstractC16208i {
    static {
        Covode.recordClassIndex(62985);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public final <T extends AbstractC16741q> T mo25763a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public final void mo25764a(Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public final void mo25765a(String str, List<String> list, List<? extends JSONObject> list2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public final void mo25766a(Throwable th) {
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public final void mo25767a(List<String> list, AbstractC16253f fVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(fVar, "");
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: b */
    public final <T extends AbstractC16568c> T mo25768b(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: e */
    public final Uri mo25772e() {
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: h */
    public final boolean mo25773h() {
        return false;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: i */
    public final void mo25774i() {
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: j */
    public final void mo25775j() {
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: k */
    public final void mo25776k() {
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: o_ */
    public final AbstractC16741q mo25778o_() {
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    public void onEvent(AbstractC16191p pVar) {
        C89219l.m154721d(pVar, "");
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: p_ */
    public final Uri mo25780p_() {
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: l */
    public final void mo25777l() {
        AbstractC16208i.C16209a.m30120a(this);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public final C16238z mo25762a() {
        return new C16238z("");
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: c */
    public final C16248b mo25770c() {
        return new C16248b();
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: d */
    public final List<String> mo25771d() {
        return new ArrayList();
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public C16587q getLoggerWrapper() {
        return new C16587q(null, "");
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printReject(Throwable th, String str) {
        C89219l.m154721d(th, "");
        C89219l.m154721d(str, "");
        AbstractC16208i.C16209a.m30122a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(str2, "");
        AbstractC16208i.C16209a.m30121a(this, str, pVar, str2);
    }
}
