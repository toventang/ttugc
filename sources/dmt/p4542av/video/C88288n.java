package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: dmt.av.video.n */
public final class C88288n {

    /* renamed from: j */
    public static final C88289a f200321j = new C88289a((byte) 0);

    /* renamed from: a */
    public AtomicInteger f200322a;

    /* renamed from: b */
    public AtomicInteger f200323b;

    /* renamed from: c */
    public AtomicInteger f200324c;

    /* renamed from: d */
    public final String f200325d;

    /* renamed from: e */
    public final boolean f200326e;

    /* renamed from: f */
    public final IAudioEffectParam f200327f;

    /* renamed from: g */
    public final List<IAudioEffectParam> f200328g;

    /* renamed from: h */
    public final int f200329h;

    /* renamed from: i */
    public final AbstractC88169b f200330i;

    static {
        Covode.recordClassIndex(104323);
    }

    /* renamed from: dmt.av.video.n$a */
    public static final class C88289a {
        static {
            Covode.recordClassIndex(104324);
        }

        private C88289a() {
        }

        /* renamed from: a */
        public static C88288n m153423a() {
            return new C88288n("clear", true, null, null, 0, 60);
        }

        public /* synthetic */ C88289a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C88288n m153424a(IAudioEffectParam iAudioEffectParam) {
            return new C88288n("apply", true, iAudioEffectParam, null, 0, 56);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.bytedance.creativex.editor.preview.IAudioEffectParam> */
    /* JADX WARN: Multi-variable type inference failed */
    private C88288n(String str, boolean z, IAudioEffectParam iAudioEffectParam, List<? extends IAudioEffectParam> list, int i) {
        this.f200325d = str;
        this.f200326e = z;
        this.f200327f = iAudioEffectParam;
        this.f200328g = list;
        this.f200329h = i;
        this.f200330i = null;
        this.f200322a = new AtomicInteger(-1);
        this.f200323b = new AtomicInteger(-1);
        this.f200324c = new AtomicInteger(-1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C88288n(String str, boolean z, IAudioEffectParam iAudioEffectParam, List list, int i, int i2) {
        this(str, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? null : iAudioEffectParam, (i2 & 8) == 0 ? list : null, (i2 & 16) != 0 ? 1 : i);
    }
}
