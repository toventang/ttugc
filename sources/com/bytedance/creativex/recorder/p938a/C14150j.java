package com.bytedance.creativex.recorder.p938a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31208c;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.a.j */
public final class C14150j implements AbstractC78054d {

    /* renamed from: a */
    private int f34402a;

    /* renamed from: b */
    private int f34403b;

    /* renamed from: c */
    private int f34404c;

    /* renamed from: d */
    private int f34405d;

    /* renamed from: e */
    private boolean f34406e = true;

    /* renamed from: f */
    private boolean f34407f = true;

    /* renamed from: g */
    private final AbstractC31193a f34408g;

    static {
        Covode.recordClassIndex(16219);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: b */
    public final void mo22680b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: o */
    public final void mo22690o() {
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: k */
    public final int mo22686k() {
        return this.f34402a;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: l */
    public final int mo22687l() {
        return this.f34404c;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: m */
    public final int mo22688m() {
        return this.f34403b;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: n */
    public final int mo22689n() {
        return this.f34405d;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: e */
    public final void mo22682e(boolean z) {
        this.f34406e = z;
        this.f34407f = z;
    }

    public C14150j(AbstractC31193a aVar) {
        C89219l.m154721d(aVar, "");
        this.f34408g = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: a */
    public final void mo22675a(List<BeautyComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        this.f34408g.mo56823b(C14116h.m25714a(list), i);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: b */
    public final void mo22679b(List<BeautyComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        this.f34408g.mo56824c(C14116h.m25714a(list), i);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: c */
    public final void mo22681c(List<BeautyComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        this.f34408g.mo56821a(C14116h.m25714a(list), i);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: a */
    public final int[] mo22677a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f34408g.mo56808c(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: a */
    public final void mo22674a(String str, String str2, float f) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC31208c e = this.f34408g.mo56826e();
        e.mo56841a(str, str2, f);
        e.mo56842a();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: a */
    public final void mo22676a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2, int i) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f34408g.mo56822a(C14116h.m25714a(list), C14116h.m25714a(list2), i);
    }
}
