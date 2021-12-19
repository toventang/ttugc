package com.p2082ss.android.ugc.asve.recorder.effect;

import android.content.Context;
import android.graphics.Bitmap;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.RecordInvoker;
import com.p2082ss.android.medialib.presenter.AbstractC30029f;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b;
import com.p2082ss.android.ugc.asve.wrap.AbstractC31262b;
import com.p2082ss.android.ugc.asve.wrap.AbstractC31263c;
import com.p2082ss.android.vesdk.AbstractC85313aj;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.C85392bf;
import com.p2082ss.android.vesdk.VEARCoreParam;
import com.p2082ss.android.vesdk.filterparam.VEEffectFilterParam;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.a */
public interface AbstractC31193a extends AbstractC31206b {
    static {
        Covode.recordClassIndex(37838);
    }

    /* renamed from: a */
    int mo56753a(int i, float f);

    /* renamed from: a */
    int mo56754a(Bitmap bitmap);

    /* renamed from: a */
    int mo56755a(VEEffectFilterParam vEEffectFilterParam);

    /* renamed from: a */
    int mo56756a(String str, float f, float f2);

    /* renamed from: a */
    int mo56757a(String str, String str2);

    /* renamed from: a */
    int mo56758a(String str, String str2, float f);

    /* renamed from: a */
    int mo56759a(String[] strArr, int i);

    /* renamed from: a */
    void mo56760a();

    /* renamed from: a */
    void mo56761a(double d);

    /* renamed from: a */
    void mo56762a(double d, double d2, double d3, double d4);

    /* renamed from: a */
    void mo56763a(float f);

    /* renamed from: a */
    void mo56764a(float f, float f2);

    /* renamed from: a */
    void mo56765a(float f, float f2, float f3, float f4, float f5);

    /* renamed from: a */
    void mo56766a(int i);

    /* renamed from: a */
    void mo56767a(int i, float f, float f2, int i2);

    /* renamed from: a */
    void mo56768a(int i, int i2, C85346av.AbstractC85358d dVar);

    /* renamed from: a */
    void mo56769a(int i, long j, long j2, String str);

    /* renamed from: a */
    void mo56770a(int i, String str);

    /* renamed from: a */
    void mo56771a(Context context);

    /* renamed from: a */
    void mo56772a(Context context, String str, String str2);

    /* renamed from: a */
    void mo56773a(Context context, String str, String str2, String str3);

    /* renamed from: a */
    void mo56774a(MessageCenter.Listener listener);

    /* renamed from: a */
    void mo56775a(RecordInvoker.OnARTextContentCallback onARTextContentCallback);

    /* renamed from: a */
    void mo56776a(RecordInvoker.OnARTextCountCallback onARTextCountCallback);

    /* renamed from: a */
    void mo56777a(RecordInvoker.OnCherEffectParmaCallback onCherEffectParmaCallback);

    /* renamed from: a */
    void mo56778a(AbstractC31262b bVar);

    /* renamed from: a */
    void mo56779a(AbstractC31263c cVar);

    /* renamed from: a */
    void mo56780a(VEARCoreParam vEARCoreParam);

    /* renamed from: a */
    void mo56781a(AbstractC85313aj ajVar);

    /* renamed from: a */
    void mo56782a(C85346av.AbstractC85356b bVar, int i);

    /* renamed from: a */
    void mo56783a(String str);

    /* renamed from: a */
    void mo56784a(String str, float f);

    /* renamed from: a */
    void mo56785a(String str, int i, int i2, String str2);

    /* renamed from: a */
    void mo56786a(String str, String str2, float f, float f2, float f3);

    /* renamed from: a */
    void mo56787a(boolean z);

    /* renamed from: a */
    void mo56788a(boolean z, boolean z2, boolean z3, boolean z4);

    /* renamed from: a */
    void mo56789a(double[] dArr, double d);

    /* renamed from: a */
    void mo56790a(String[] strArr, double[] dArr, boolean[] zArr);

    /* renamed from: a */
    boolean mo56791a(C85392bf bfVar, int i);

    /* renamed from: b */
    float mo56792b(String str);

    /* renamed from: b */
    int mo56793b(String str, float f, float f2);

    /* renamed from: b */
    int mo56794b(String[] strArr, int i);

    /* renamed from: b */
    void mo56795b();

    /* renamed from: b */
    void mo56796b(double d, double d2, double d3, double d4);

    /* renamed from: b */
    void mo56797b(float f, float f2);

    /* renamed from: b */
    void mo56798b(int i);

    /* renamed from: b */
    void mo56799b(MessageCenter.Listener listener);

    /* renamed from: b */
    void mo56800b(AbstractC85313aj ajVar);

    /* renamed from: b */
    void mo56801b(String str, String str2);

    /* renamed from: b */
    void mo56802b(boolean z);

    /* renamed from: c */
    AbstractC30029f mo56803c();

    /* renamed from: c */
    void mo56804c(double d, double d2, double d3, double d4);

    /* renamed from: c */
    void mo56805c(float f, float f2);

    /* renamed from: c */
    void mo56806c(String str);

    /* renamed from: c */
    void mo56807c(boolean z);

    /* renamed from: c */
    int[] mo56808c(String str, String str2);

    /* renamed from: d */
    void mo56809d();

    /* renamed from: d */
    void mo56810d(float f, float f2);

    /* renamed from: d */
    void mo56811d(String str);

    /* renamed from: d */
    void mo56812d(boolean z);

    /* renamed from: e */
    VEFrame mo56813e(String str);

    /* renamed from: e */
    void mo56814e(float f, float f2);

    /* renamed from: e */
    void mo56815e(boolean z);

    /* renamed from: f */
    void mo56816f(float f, float f2);

    /* renamed from: f */
    void mo56817f(boolean z);

    /* renamed from: g */
    void mo56818g(boolean z);

    /* renamed from: h */
    void mo56819h(boolean z);
}
