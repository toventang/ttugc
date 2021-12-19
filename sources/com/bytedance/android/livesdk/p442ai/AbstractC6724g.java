package com.bytedance.android.livesdk.p442ai;

import android.graphics.Point;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11663q;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.ai.g */
public interface AbstractC6724g {

    /* renamed from: com.bytedance.android.livesdk.ai.g$a */
    public interface AbstractC6725a {
        static {
            Covode.recordClassIndex(7463);
        }

        /* renamed from: a */
        void mo12905a(EnumC6727c cVar, int i, String str);
    }

    /* renamed from: com.bytedance.android.livesdk.ai.g$b */
    public interface AbstractC6726b {
        static {
            Covode.recordClassIndex(7464);
        }

        /* renamed from: h */
        void mo12906h();

        /* renamed from: i */
        void mo12907i();
    }

    static {
        Covode.recordClassIndex(7462);
    }

    /* renamed from: a */
    void mo12877a();

    /* renamed from: a */
    void mo12878a(int i);

    /* renamed from: a */
    void mo12879a(Surface surface);

    /* renamed from: a */
    void mo12880a(SurfaceHolder surfaceHolder);

    /* renamed from: a */
    void mo12881a(AbstractC6725a aVar, AbstractC6726b bVar);

    /* renamed from: a */
    void mo12882a(C11690a aVar);

    /* renamed from: a */
    void mo12883a(String str);

    /* renamed from: a */
    void mo12884a(String str, AbstractC11663q qVar);

    /* renamed from: a */
    void mo12885a(String str, String str2);

    /* renamed from: a */
    void mo12886a(String str, Map<String, String> map, EnumC6728d dVar);

    /* renamed from: a */
    void mo12887a(boolean z);

    /* renamed from: a */
    void mo12888a(boolean z, boolean z2, int i);

    /* renamed from: b */
    void mo12889b();

    /* renamed from: b */
    void mo12890b(String str);

    /* renamed from: b */
    void mo12891b(boolean z);

    /* renamed from: c */
    void mo12892c();

    /* renamed from: c */
    void mo12893c(String str);

    /* renamed from: c */
    void mo12894c(boolean z);

    /* renamed from: d */
    void mo12895d();

    /* renamed from: d */
    void mo12896d(boolean z);

    /* renamed from: e */
    void mo12897e();

    /* renamed from: e */
    void mo12898e(boolean z);

    /* renamed from: f */
    void mo12899f();

    /* renamed from: g */
    boolean mo12900g();

    /* renamed from: h */
    boolean mo12901h();

    /* renamed from: i */
    Point mo12902i();

    /* renamed from: j */
    JSONObject mo12903j();

    /* renamed from: k */
    String mo12904k();

    /* renamed from: com.bytedance.android.livesdk.ai.g$d */
    public enum EnumC6728d {
        VIDEO,
        AUDIO,
        OBS,
        SCREENSHOT;

        static {
            Covode.recordClassIndex(7466);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ai.g$c */
    public enum EnumC6727c {
        PREPARED,
        PREPARE_FAILED,
        VIDEO_SIZE_CHANGED,
        PLAY_COMPLETED,
        MEDIA_ERROR,
        RENDERING_START,
        BUFFERING_START,
        BUFFERING_END,
        SEI_UPDATE,
        RESOLUTION_DEGRADE;

        static {
            Covode.recordClassIndex(7465);
        }
    }
}
