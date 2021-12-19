package com.p2082ss.android.ugc.aweme.story.record;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.story.record.C77517e;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.d */
public final class C77496d extends AbstractC77461a {

    /* renamed from: d */
    public C77517e f173835d;

    /* renamed from: e */
    private final boolean f173836e;

    /* renamed from: i */
    private View f173837i;

    /* renamed from: j */
    private final Bundle f173838j;

    static {
        Covode.recordClassIndex(90531);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.record.AbstractC77461a, com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: c */
    public final void mo120321c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.story.record.AbstractC77461a
    /* renamed from: F */
    public final boolean mo121094F() {
        return this.f173836e;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.story.record.AbstractC77461a
    /* renamed from: G */
    public final void mo121095G() {
        if (this.f173835d == null) {
            C77517e a = C77517e.C77520c.m135547a(this.f173838j);
            EnterStoryParam enterStoryParam = ((AbstractC77461a) this).f173789b;
            if (enterStoryParam != null) {
                a.mo120319a(enterStoryParam);
            }
            this.f173835d = a;
            if (a == null) {
                C89219l.m154710a("storyRecordRootScene");
            }
            mo36387a(R.id.acf, a, "StoryRecordRootScene");
            View view = this.f173837i;
            if (view == null) {
                C89219l.m154710a("fakeViewContainer");
            }
            view.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.record.AbstractC77461a, com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: b */
    public final boolean mo120320b() {
        if (this.f173835d == null) {
            return false;
        }
        C77517e eVar = this.f173835d;
        if (eVar == null) {
            C89219l.m154710a("storyRecordRootScene");
        }
        return eVar.mo120320b();
    }

    public C77496d(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        this.f173838j = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.record.AbstractC77461a, com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.ayz);
        C89219l.m154716b(c, "");
        this.f173837i = c;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.record.AbstractC77461a, com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: a */
    public final void mo120319a(EnterStoryParam enterStoryParam) {
        C89219l.m154721d(enterStoryParam, "");
        super.mo120319a(enterStoryParam);
        if (this.f173835d != null) {
            C77517e eVar = this.f173835d;
            if (eVar == null) {
                C89219l.m154710a("storyRecordRootScene");
            }
            eVar.mo120319a(enterStoryParam);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b27, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.record.AbstractC77461a, com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: a */
    public final void mo120318a(int i, int i2, Intent intent) {
        if (this.f173835d != null) {
            C77517e eVar = this.f173835d;
            if (eVar == null) {
                C89219l.m154710a("storyRecordRootScene");
            }
            eVar.mo120318a(i, i2, intent);
        }
    }
}
