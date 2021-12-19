package com.p2082ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b;
import com.p2082ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p2082ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESafeAreaParams;
import com.p2082ss.android.vesdk.runtime.VEMapBufferInfo;
import java.util.List;
import org.libsdl.app.AudioRecorderInterface;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.view.h */
public final class C31258h implements AbstractC31133a {

    /* renamed from: a */
    private final AbstractC31133a f74942a;

    static {
        Covode.recordClassIndex(37906);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final int mo56584a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f74942a.mo56584a(i, i2, str, i3, i4, str2, i5, z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final int mo56585a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C89219l.m154721d(context, "");
        return this.f74942a.mo56585a(context, audioRecorderInterface);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final int mo56586a(String str, int i, int i2, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        return this.f74942a.mo56586a(str, i, i2, bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56587a(double d, boolean z, float f, int i, int i2, boolean z2, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f74942a.mo56587a(d, z, f, i, i2, z2, bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56588a(int i, VESafeAreaParams[] vESafeAreaParamsArr) {
        this.f74942a.mo56588a(i, vESafeAreaParamsArr);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56589a(long j) {
        this.f74942a.mo56589a(j);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56590a(Surface surface) {
        this.f74942a.mo56590a(surface);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56591a(Surface surface, String str, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(surface, "");
        C89219l.m154721d(str, "");
        this.f74942a.mo56591a(surface, str, bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56592a(PrivacyCert privacyCert) {
        this.f74942a.mo56592a(privacyCert);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56593a(AbstractC31014b bVar) {
        this.f74942a.mo56593a(bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56594a(VEListener.AbstractC85241j jVar) {
        this.f74942a.mo56594a(jVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56595a(C85346av.AbstractC85362h hVar) {
        C89219l.m154721d(hVar, "");
        this.f74942a.mo56595a(hVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56596a(AbstractC89172b<? super Integer, C89391z> bVar) {
        this.f74942a.mo56596a(bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56597a(AbstractC89172b<? super Integer, C89391z> bVar, AbstractC89171a<C89391z> aVar) {
        this.f74942a.mo56597a(bVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56598a(String str, double d, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        this.f74942a.mo56598a(str, d, bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56599a(String str, int i, int i2, boolean z, Bitmap.CompressFormat compressFormat, AbstractC89172b<? super Integer, C89391z> bVar, boolean z2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(compressFormat, "");
        C89219l.m154721d(bVar, "");
        this.f74942a.mo56599a(str, i, i2, z, compressFormat, bVar, z2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56600a(String str, long j, long j2, boolean z) {
        this.f74942a.mo56600a(str, j, j2, z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56601a(String str, String str2, boolean z, String str3, String str4, AbstractC89172b<? super RecorderConcatResult, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f74942a.mo56601a(str, str2, z, str3, str4, bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56602a(List<ASMediaSegment> list, String str, String str2, int i, VEListener.AbstractC85241j jVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(jVar, "");
        this.f74942a.mo56602a(list, str, str2, i, jVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56603a(boolean z) {
        this.f74942a.mo56603a(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56604a(boolean z, PrivacyCert privacyCert) {
        this.f74942a.mo56604a(z, privacyCert);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56605a(boolean z, AbstractC89172b<? super Integer, C89391z> bVar) {
        this.f74942a.mo56605a(z, bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final boolean mo56606a() {
        return this.f74942a.mo56606a();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final boolean mo56607a(boolean z, String str) {
        C89219l.m154721d(str, "");
        return this.f74942a.mo56607a(z, str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: b */
    public final int mo56608b() {
        return this.f74942a.mo56608b();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: b */
    public final int mo56609b(Context context, AudioRecorderInterface audioRecorderInterface) {
        C89219l.m154721d(context, "");
        return this.f74942a.mo56609b(context, audioRecorderInterface);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: b */
    public final void mo56610b(Surface surface, String str, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(surface, "");
        C89219l.m154721d(str, "");
        this.f74942a.mo56610b(surface, str, bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: b */
    public final void mo56611b(VEListener.AbstractC85241j jVar) {
        this.f74942a.mo56611b(jVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: b */
    public final boolean mo56612b(boolean z) {
        return this.f74942a.mo56612b(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: c */
    public final void mo56613c() {
        this.f74942a.mo56613c();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31124b
    /* renamed from: c */
    public final void mo56578c(PrivacyCert privacyCert) {
        this.f74942a.mo56578c(privacyCert);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: c */
    public final void mo56614c(VEListener.AbstractC85241j jVar) {
        C89219l.m154721d(jVar, "");
        this.f74942a.mo56614c(jVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: c */
    public final void mo56615c(boolean z) {
        this.f74942a.mo56615c(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: d */
    public final long mo56616d() {
        return this.f74942a.mo56616d();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31124b
    /* renamed from: d */
    public final void mo56579d(PrivacyCert privacyCert) {
        this.f74942a.mo56579d(privacyCert);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: d */
    public final void mo56617d(boolean z) {
        this.f74942a.mo56617d(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: e */
    public final boolean mo56618e() {
        return this.f74942a.mo56618e();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: f */
    public final long mo56619f() {
        return this.f74942a.mo56619f();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: g */
    public final void mo56620g() {
        this.f74942a.mo56620g();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: h */
    public final LiveData<Boolean> mo56621h() {
        return this.f74942a.mo56621h();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: i */
    public final int mo56622i() {
        return this.f74942a.mo56622i();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: j */
    public final int mo56623j() {
        return this.f74942a.mo56623j();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: k */
    public final int mo56624k() {
        return this.f74942a.mo56624k();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: l */
    public final float mo56625l() {
        return this.f74942a.mo56625l();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: m */
    public final int mo56626m() {
        return this.f74942a.mo56626m();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: n */
    public final int mo56627n() {
        return this.f74942a.mo56627n();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: o */
    public final int mo56628o() {
        return this.f74942a.mo56628o();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: p */
    public final float mo56629p() {
        return this.f74942a.mo56629p();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: q */
    public final float mo56630q() {
        return this.f74942a.mo56630q();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: r */
    public final int mo56631r() {
        return this.f74942a.mo56631r();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: s */
    public final float[] mo56632s() {
        return this.f74942a.mo56632s();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: t */
    public final String[] mo56633t() {
        return this.f74942a.mo56633t();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: u */
    public final void mo56634u() {
        this.f74942a.mo56634u();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: v */
    public final VEMapBufferInfo mo56635v() {
        return this.f74942a.mo56635v();
    }

    public C31258h(AbstractC31133a aVar) {
        C89219l.m154721d(aVar, "");
        this.f74942a = aVar;
    }
}
