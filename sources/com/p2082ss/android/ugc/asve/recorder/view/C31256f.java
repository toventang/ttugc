package com.p2082ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.graphics.Bitmap;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.RecordInvoker;
import com.p2082ss.android.medialib.presenter.AbstractC30029f;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31208c;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p2082ss.android.ugc.asve.wrap.AbstractC31262b;
import com.p2082ss.android.ugc.asve.wrap.AbstractC31263c;
import com.p2082ss.android.vesdk.AbstractC85313aj;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.C85392bf;
import com.p2082ss.android.vesdk.VEARCoreParam;
import com.p2082ss.android.vesdk.filterparam.VEEffectFilterParam;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.view.f */
public final class C31256f implements AbstractC31193a {

    /* renamed from: a */
    private final AbstractC31193a f74941a;

    static {
        Covode.recordClassIndex(37904);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56753a(int i, float f) {
        return this.f74941a.mo56753a(i, f);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56754a(Bitmap bitmap) {
        return this.f74941a.mo56754a(bitmap);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56755a(VEEffectFilterParam vEEffectFilterParam) {
        C89219l.m154721d(vEEffectFilterParam, "");
        return this.f74941a.mo56755a(vEEffectFilterParam);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56756a(String str, float f, float f2) {
        C89219l.m154721d(str, "");
        return this.f74941a.mo56756a(str, f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56757a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f74941a.mo56757a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56758a(String str, String str2, float f) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f74941a.mo56758a(str, str2, f);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56759a(String[] strArr, int i) {
        C89219l.m154721d(strArr, "");
        return this.f74941a.mo56759a(strArr, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56760a() {
        this.f74941a.mo56760a();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56761a(double d) {
        this.f74941a.mo56761a(d);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56762a(double d, double d2, double d3, double d4) {
        this.f74941a.mo56762a(d, d2, d3, d4);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56763a(float f) {
        this.f74941a.mo56763a(f);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56764a(float f, float f2) {
        this.f74941a.mo56764a(f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56765a(float f, float f2, float f3, float f4, float f5) {
        this.f74941a.mo56765a(f, f2, f3, f4, f5);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56766a(int i) {
        this.f74941a.mo56766a(i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56767a(int i, float f, float f2, int i2) {
        this.f74941a.mo56767a(i, f, f2, i2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56768a(int i, int i2, C85346av.AbstractC85358d dVar) {
        this.f74941a.mo56768a(i, i2, dVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56769a(int i, long j, long j2, String str) {
        C89219l.m154721d(str, "");
        this.f74941a.mo56769a(i, j, j2, str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56770a(int i, String str) {
        C89219l.m154721d(str, "");
        this.f74941a.mo56770a(i, str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56771a(Context context) {
        C89219l.m154721d(context, "");
        this.f74941a.mo56771a(context);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56772a(Context context, String str, String str2) {
        this.f74941a.mo56772a(context, str, str2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56773a(Context context, String str, String str2, String str3) {
        this.f74941a.mo56773a(context, str, str2, str3);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56774a(MessageCenter.Listener listener) {
        C89219l.m154721d(listener, "");
        this.f74941a.mo56774a(listener);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56775a(RecordInvoker.OnARTextContentCallback onARTextContentCallback) {
        C89219l.m154721d(onARTextContentCallback, "");
        this.f74941a.mo56775a(onARTextContentCallback);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56776a(RecordInvoker.OnARTextCountCallback onARTextCountCallback) {
        C89219l.m154721d(onARTextCountCallback, "");
        this.f74941a.mo56776a(onARTextCountCallback);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56777a(RecordInvoker.OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C89219l.m154721d(onCherEffectParmaCallback, "");
        this.f74941a.mo56777a(onCherEffectParmaCallback);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56778a(AbstractC31262b bVar) {
        C89219l.m154721d(bVar, "");
        this.f74941a.mo56778a(bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56779a(AbstractC31263c cVar) {
        C89219l.m154721d(cVar, "");
        this.f74941a.mo56779a(cVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56780a(VEARCoreParam vEARCoreParam) {
        C89219l.m154721d(vEARCoreParam, "");
        this.f74941a.mo56780a(vEARCoreParam);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56781a(AbstractC85313aj ajVar) {
        C89219l.m154721d(ajVar, "");
        this.f74941a.mo56781a(ajVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56782a(C85346av.AbstractC85356b bVar, int i) {
        this.f74941a.mo56782a(bVar, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56783a(String str) {
        this.f74941a.mo56783a(str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56784a(String str, float f) {
        this.f74941a.mo56784a(str, f);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56785a(String str, int i, int i2, String str2) {
        C89219l.m154721d(str2, "");
        this.f74941a.mo56785a(str, i, i2, str2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56786a(String str, String str2, float f, float f2, float f3) {
        this.f74941a.mo56786a(str, str2, f, f2, f3);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: a */
    public final void mo56820a(List<ComposerInfo> list) {
        C89219l.m154721d(list, "");
        this.f74941a.mo56820a(list);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: a */
    public final void mo56821a(List<ComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        this.f74941a.mo56821a(list, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: a */
    public final void mo56822a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f74941a.mo56822a(list, list2, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56787a(boolean z) {
        this.f74941a.mo56787a(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56788a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f74941a.mo56788a(z, z2, z3, z4);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56789a(double[] dArr, double d) {
        C89219l.m154721d(dArr, "");
        this.f74941a.mo56789a(dArr, d);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56790a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f74941a.mo56790a(strArr, dArr, zArr);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final boolean mo56791a(C85392bf bfVar, int i) {
        C89219l.m154721d(bfVar, "");
        return this.f74941a.mo56791a(bfVar, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final float mo56792b(String str) {
        C89219l.m154721d(str, "");
        return this.f74941a.mo56792b(str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final int mo56793b(String str, float f, float f2) {
        C89219l.m154721d(str, "");
        return this.f74941a.mo56793b(str, f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final int mo56794b(String[] strArr, int i) {
        C89219l.m154721d(strArr, "");
        return this.f74941a.mo56794b(strArr, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56795b() {
        this.f74941a.mo56795b();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56796b(double d, double d2, double d3, double d4) {
        this.f74941a.mo56796b(d, d2, d3, d4);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56797b(float f, float f2) {
        this.f74941a.mo56797b(f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56798b(int i) {
        this.f74941a.mo56798b(i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56799b(MessageCenter.Listener listener) {
        C89219l.m154721d(listener, "");
        this.f74941a.mo56799b(listener);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56800b(AbstractC85313aj ajVar) {
        C89219l.m154721d(ajVar, "");
        this.f74941a.mo56800b(ajVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56801b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f74941a.mo56801b(str, str2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: b */
    public final void mo56823b(List<ComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        this.f74941a.mo56823b(list, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56802b(boolean z) {
        this.f74941a.mo56802b(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: c */
    public final AbstractC30029f mo56803c() {
        return this.f74941a.mo56803c();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: c */
    public final void mo56804c(double d, double d2, double d3, double d4) {
        this.f74941a.mo56804c(d, d2, d3, d4);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: c */
    public final void mo56805c(float f, float f2) {
        this.f74941a.mo56805c(f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: c */
    public final void mo56806c(String str) {
        C89219l.m154721d(str, "");
        this.f74941a.mo56806c(str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: c */
    public final void mo56824c(List<ComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        this.f74941a.mo56824c(list, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: c */
    public final void mo56807c(boolean z) {
        this.f74941a.mo56807c(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: c */
    public final int[] mo56808c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f74941a.mo56808c(str, str2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: d */
    public final void mo56809d() {
        this.f74941a.mo56809d();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: d */
    public final void mo56810d(float f, float f2) {
        this.f74941a.mo56810d(f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: d */
    public final void mo56811d(String str) {
        this.f74941a.mo56811d(str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: d */
    public final void mo56825d(List<ComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        this.f74941a.mo56825d(list, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: d */
    public final void mo56812d(boolean z) {
        this.f74941a.mo56812d(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: e */
    public final VEFrame mo56813e(String str) {
        return this.f74941a.mo56813e(str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: e */
    public final AbstractC31208c mo56826e() {
        return this.f74941a.mo56826e();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: e */
    public final void mo56814e(float f, float f2) {
        this.f74941a.mo56814e(f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: e */
    public final void mo56815e(boolean z) {
        this.f74941a.mo56815e(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: f */
    public final void mo56827f() {
        this.f74941a.mo56827f();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: f */
    public final void mo56816f(float f, float f2) {
        this.f74941a.mo56816f(f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: f */
    public final void mo56817f(boolean z) {
        this.f74941a.mo56817f(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: g */
    public final void mo56818g(boolean z) {
        this.f74941a.mo56818g(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: h */
    public final void mo56819h(boolean z) {
        this.f74941a.mo56819h(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: i */
    public final void mo56828i(boolean z) {
        this.f74941a.mo56828i(z);
    }

    public C31256f(AbstractC31193a aVar) {
        C89219l.m154721d(aVar, "");
        this.f74941a = aVar;
    }
}
