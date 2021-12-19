package com.p2082ss.android.ugc.aweme.video;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Audio;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.video.p4209c.C80712b;
import com.p2082ss.android.ugc.aweme.video.p4209c.C80713c;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.i */
public interface AbstractC80747i extends AbstractC80732h, AbstractC80748j {
    static {
        Covode.recordClassIndex(94037);
    }

    /* renamed from: A */
    void mo123907A();

    /* renamed from: B */
    void mo123908B();

    /* renamed from: C */
    void mo123909C();

    /* renamed from: D */
    void mo123910D();

    /* renamed from: E */
    void mo123911E();

    /* renamed from: F */
    void mo123912F();

    /* renamed from: G */
    void mo123913G();

    /* renamed from: H */
    void mo123914H();

    /* renamed from: I */
    void mo123915I();

    /* renamed from: J */
    void mo123916J();

    /* renamed from: K */
    long mo123917K();

    /* renamed from: L */
    AbstractC81002f mo123918L();

    /* renamed from: M */
    int mo123919M();

    /* renamed from: N */
    int mo123920N();

    /* renamed from: a */
    String mo123921a(Video video, int i);

    /* renamed from: a */
    String mo123922a(Video video, Audio audio, boolean z, OnUIPlayListener onUIPlayListener, int i, C80713c cVar);

    /* renamed from: a */
    String mo123923a(Video video, Audio audio, boolean z, boolean z2);

    /* renamed from: a */
    String mo123924a(Video video, Audio audio, boolean z, boolean z2, int i);

    /* renamed from: a */
    String mo123925a(Video video, Audio audio, boolean z, boolean z2, int i, boolean z3, boolean z4, C80713c cVar);

    /* renamed from: a */
    String mo123926a(Video video, OnUIPlayListener onUIPlayListener);

    /* renamed from: a */
    String mo123927a(Video video, OnUIPlayListener onUIPlayListener, int i);

    /* renamed from: a */
    String mo123928a(Video video, boolean z);

    /* renamed from: a */
    String mo123929a(VideoUrlModel videoUrlModel, boolean z, C80713c cVar);

    /* renamed from: a */
    String mo123930a(C80712b bVar);

    /* renamed from: a */
    void mo123931a(float f);

    /* renamed from: a */
    void mo123932a(float f, float f2);

    /* renamed from: a */
    void mo123933a(int i);

    /* renamed from: a */
    void mo123934a(Surface surface);

    /* renamed from: a */
    void mo123935a(Audio.InfoIdType infoIdType);

    /* renamed from: a */
    void mo123936a(Aweme aweme);

    /* renamed from: a */
    void mo123937a(OnUIPlayListener onUIPlayListener);

    /* renamed from: a */
    void mo123938a(C80775n nVar);

    /* renamed from: a */
    void mo123939a(List<Aweme> list);

    /* renamed from: a */
    void mo123940a(boolean z);

    /* renamed from: b */
    String mo123941b(Video video, OnUIPlayListener onUIPlayListener);

    /* renamed from: b */
    String mo123942b(Video video, OnUIPlayListener onUIPlayListener, int i);

    /* renamed from: b */
    String mo123943b(C80775n nVar);

    /* renamed from: b */
    void mo123944b(Aweme aweme);

    /* renamed from: b */
    boolean mo123945b(OnUIPlayListener onUIPlayListener);

    /* renamed from: c */
    void mo123946c(OnUIPlayListener onUIPlayListener);

    /* renamed from: v */
    void mo123947v();

    /* renamed from: w */
    void mo123948w();

    /* renamed from: x */
    void mo123949x();

    /* renamed from: y */
    void mo123950y();

    /* renamed from: z */
    void mo123951z();
}
