package com.p2082ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.loader.C20818s;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1835g.AbstractC24106c;
import com.facebook.common.p1835g.EnumC24105b;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imageutils.C24658b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58152b;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2359ay.C34369d;
import com.p2082ss.android.ugc.aweme.p2359ay.C34381m;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImpl.task.FrescoTask */
public class FrescoTask implements AbstractC58084a, AbstractC58264w {
    static {
        Covode.recordClassIndex(68723);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: c */
    public final String[] mo28603c() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: d */
    public final int mo28604d() {
        return 2;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: e */
    public final EnumC58149ac mo28605e() {
        return EnumC58149ac.CPU;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        if (C58152b.m105089g()) {
            return EnumC58151ae.MAIN;
        }
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        C80720e.m139919a(context);
        if (C58195d.m105111d()) {
            C24658b.f58579a = C58462a.f133093a;
        }
        try {
            C34577e.f81614a = true;
            C34369d dVar = C34369d.f81252a;
            if (dVar != null) {
                C24099a.f57025a = dVar;
                Context a = C17867d.m33078a();
                C34381m mVar = new C34381m();
                if (!C20761r.f48993c) {
                    C20761r.f48993c = true;
                    C20761r.f48992b = mVar;
                    C20761r.f48994d = a.getPackageName();
                    C20761r.f48991a.init(mVar);
                }
                C24182c.f57221c = false;
                C20818s.C20819a.f49249a.mo34255a(new AbstractC24106c() {
                    /* class com.p2082ss.android.ugc.aweme.legoImpl.task.FrescoTask.C584541 */

                    static {
                        Covode.recordClassIndex(68724);
                    }

                    @Override // com.facebook.common.p1835g.AbstractC24106c
                    /* renamed from: a */
                    public final void mo39663a(EnumC24105b bVar) {
                        try {
                            double suggestedTrimRatio = bVar.getSuggestedTrimRatio();
                            if (EnumC24105b.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio() == suggestedTrimRatio || EnumC24105b.OnSystemLowMemoryWhileAppInBackground.getSuggestedTrimRatio() == suggestedTrimRatio || EnumC24105b.OnSystemLowMemoryWhileAppInForeground.getSuggestedTrimRatio() == suggestedTrimRatio) {
                                C24428k.m46551a().mo40247e().mo40227a();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                System.currentTimeMillis();
                valueOf.longValue();
                return;
            }
            throw new IllegalArgumentException();
        } catch (Exception e) {
            C13468b.m24211a(e, "[Lighten][Fresco][Initializer][Throwable]");
            throw e;
        }
    }
}
