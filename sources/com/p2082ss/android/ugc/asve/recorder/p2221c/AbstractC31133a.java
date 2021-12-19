package com.p2082ss.android.ugc.asve.recorder.p2221c;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b;
import com.p2082ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p2082ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31124b;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESafeAreaParams;
import com.p2082ss.android.vesdk.runtime.VEMapBufferInfo;
import java.util.List;
import org.libsdl.app.AudioRecorderInterface;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.asve.recorder.c.a */
public interface AbstractC31133a extends AbstractC31124b {
    static {
        Covode.recordClassIndex(37776);
    }

    /* renamed from: a */
    int mo56584a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z);

    /* renamed from: a */
    int mo56585a(Context context, AudioRecorderInterface audioRecorderInterface);

    /* renamed from: a */
    int mo56586a(String str, int i, int i2, AbstractC89172b<? super Integer, C89391z> bVar);

    /* renamed from: a */
    void mo56587a(double d, boolean z, float f, int i, int i2, boolean z2, AbstractC89172b<? super Integer, C89391z> bVar);

    /* renamed from: a */
    void mo56588a(int i, VESafeAreaParams[] vESafeAreaParamsArr);

    /* renamed from: a */
    void mo56589a(long j);

    /* renamed from: a */
    void mo56590a(Surface surface);

    /* renamed from: a */
    void mo56591a(Surface surface, String str, AbstractC89172b<? super Integer, C89391z> bVar);

    /* renamed from: a */
    void mo56592a(PrivacyCert privacyCert);

    /* renamed from: a */
    void mo56593a(AbstractC31014b bVar);

    /* renamed from: a */
    void mo56594a(VEListener.AbstractC85241j jVar);

    /* renamed from: a */
    void mo56595a(C85346av.AbstractC85362h hVar);

    /* renamed from: a */
    void mo56596a(AbstractC89172b<? super Integer, C89391z> bVar);

    /* renamed from: a */
    void mo56597a(AbstractC89172b<? super Integer, C89391z> bVar, AbstractC89171a<C89391z> aVar);

    /* renamed from: a */
    void mo56598a(String str, double d, AbstractC89172b<? super Integer, C89391z> bVar);

    /* renamed from: a */
    void mo56599a(String str, int i, int i2, boolean z, Bitmap.CompressFormat compressFormat, AbstractC89172b<? super Integer, C89391z> bVar, boolean z2);

    /* renamed from: a */
    void mo56600a(String str, long j, long j2, boolean z);

    /* renamed from: a */
    void mo56601a(String str, String str2, boolean z, String str3, String str4, AbstractC89172b<? super RecorderConcatResult, C89391z> bVar);

    /* renamed from: a */
    void mo56602a(List<ASMediaSegment> list, String str, String str2, int i, VEListener.AbstractC85241j jVar);

    /* renamed from: a */
    void mo56603a(boolean z);

    /* renamed from: a */
    void mo56604a(boolean z, PrivacyCert privacyCert);

    /* renamed from: a */
    void mo56605a(boolean z, AbstractC89172b<? super Integer, C89391z> bVar);

    /* renamed from: a */
    boolean mo56606a();

    /* renamed from: a */
    boolean mo56607a(boolean z, String str);

    /* renamed from: b */
    int mo56608b();

    /* renamed from: b */
    int mo56609b(Context context, AudioRecorderInterface audioRecorderInterface);

    /* renamed from: b */
    void mo56610b(Surface surface, String str, AbstractC89172b<? super Integer, C89391z> bVar);

    /* renamed from: b */
    void mo56611b(VEListener.AbstractC85241j jVar);

    /* renamed from: b */
    boolean mo56612b(boolean z);

    /* renamed from: c */
    void mo56613c();

    /* renamed from: c */
    void mo56614c(VEListener.AbstractC85241j jVar);

    /* renamed from: c */
    void mo56615c(boolean z);

    /* renamed from: d */
    long mo56616d();

    /* renamed from: d */
    void mo56617d(boolean z);

    /* renamed from: e */
    boolean mo56618e();

    /* renamed from: f */
    long mo56619f();

    /* renamed from: g */
    void mo56620g();

    /* renamed from: h */
    LiveData<Boolean> mo56621h();

    /* renamed from: i */
    int mo56622i();

    /* renamed from: j */
    int mo56623j();

    /* renamed from: k */
    int mo56624k();

    /* renamed from: l */
    float mo56625l();

    /* renamed from: m */
    int mo56626m();

    /* renamed from: n */
    int mo56627n();

    /* renamed from: o */
    int mo56628o();

    /* renamed from: p */
    float mo56629p();

    /* renamed from: q */
    float mo56630q();

    /* renamed from: r */
    int mo56631r();

    /* renamed from: s */
    float[] mo56632s();

    /* renamed from: t */
    String[] mo56633t();

    /* renamed from: u */
    void mo56634u();

    /* renamed from: v */
    VEMapBufferInfo mo56635v();
}
