package com.p2082ss.android.ugc.aweme.music.service;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.music.AbstractC60326a;
import com.p2082ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3468c.AbstractC60747a;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.List;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.music.service.IMusicService */
public interface IMusicService {
    static {
        Covode.recordClassIndex(71657);
    }

    /* renamed from: a */
    C1731i<CollectedMusicList> mo69288a(int i, int i2);

    /* renamed from: a */
    C1731i<List<MusicModel>> mo69289a(int i, int i2, boolean z, int i3);

    /* renamed from: a */
    C1731i<BaseResponse> mo69290a(String str, int i);

    /* renamed from: a */
    C1731i<SuggestMusicList> mo69291a(String str, String str2, String str3, long j, int i, int i2);

    /* renamed from: a */
    AbstractC60326a mo69292a(AbstractC61180m mVar);

    /* renamed from: a */
    Music mo69293a(String str);

    /* renamed from: a */
    AbstractC61066c mo69294a(Context context);

    /* renamed from: a */
    MusicList mo69295a(int i, String str);

    /* renamed from: a */
    String mo69296a(int i);

    /* renamed from: a */
    String mo69297a(MusicModel musicModel);

    /* renamed from: a */
    List<AbstractC16183k> mo69298a(C16248b bVar);

    /* renamed from: a */
    void mo69299a();

    /* renamed from: a */
    void mo69300a(Activity activity, ViewGroup viewGroup, Bundle bundle, AbstractC89183m<Integer, Intent, C89391z> mVar, AbstractC89171a<C89391z> aVar);

    /* renamed from: a */
    void mo69301a(Context context, MusicModel musicModel, int i, AbstractC61065b bVar);

    /* renamed from: a */
    void mo69302a(Context context, String str, UrlModel urlModel, AbstractC61065b bVar);

    /* renamed from: a */
    void mo69303a(Context context, String str, boolean z, ProgressDialog progressDialog, AbstractC61064a aVar);

    /* renamed from: a */
    void mo69304a(TextView textView, Music music);

    /* renamed from: a */
    void mo69305a(AbstractC60747a aVar);

    /* renamed from: a */
    void mo69306a(Integer num);

    /* renamed from: a */
    boolean mo69307a(MusicModel musicModel, Context context);

    /* renamed from: a */
    boolean mo69308a(MusicModel musicModel, Context context, boolean z);

    /* renamed from: b */
    C1731i<SuggestMusicList> mo69309b(int i, int i2, boolean z, int i3);

    /* renamed from: b */
    AbstractC60326a mo69310b(AbstractC61180m mVar);

    /* renamed from: b */
    String mo69311b(MusicModel musicModel);

    /* renamed from: b */
    List<String> mo69312b(String str);

    /* renamed from: b */
    void mo69313b();

    /* renamed from: c */
    int mo69314c();

    /* renamed from: d */
    void mo69315d();

    /* renamed from: e */
    String mo69316e();

    /* renamed from: f */
    boolean mo69317f();

    /* renamed from: g */
    int mo69318g();

    /* renamed from: h */
    AbstractC60747a mo69319h();

    /* renamed from: i */
    void mo69320i();

    /* renamed from: j */
    void mo69321j();

    /* renamed from: k */
    void mo69322k();

    /* renamed from: l */
    Class<?> mo69323l();
}
