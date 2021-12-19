package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LiveEvent;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63510e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.model.C66289b;
import com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b;
import com.p2082ss.android.ugc.aweme.share.p3746d.AbstractC68912f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.ShareChannelBar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.share.ShareService */
public interface ShareService {

    /* renamed from: com.ss.android.ugc.aweme.share.ShareService$a */
    public static final class C68828a {
        static {
            Covode.recordClassIndex(81125);
        }
    }

    static {
        Covode.recordClassIndex(81124);
    }

    /* renamed from: a */
    Dialog mo109392a(Activity activity, Fragment fragment, Aweme aweme, boolean z, AbstractC49691s<C49672ag> sVar, Bundle bundle);

    /* renamed from: a */
    Dialog mo109393a(Activity activity, C11666c cVar, AbstractC11665b bVar);

    /* renamed from: a */
    AbstractC68903b mo109394a(Activity activity, Aweme aweme);

    /* renamed from: a */
    AbstractC68903b mo109395a(Activity activity, Aweme aweme, int i);

    /* renamed from: a */
    AbstractC69358o mo109396a(User user, Activity activity, AbstractC63510e eVar);

    /* renamed from: a */
    SharePackage mo109397a(Context context, Aweme aweme, String str, String str2);

    /* renamed from: a */
    ShareChannelBar mo109398a(Activity activity);

    /* renamed from: a */
    DialogC69695i mo109399a(Activity activity, Fragment fragment, Aweme aweme, AbstractC49691s<C49672ag> sVar, Bundle bundle);

    /* renamed from: a */
    void mo109400a(Activity activity, ShareInfo shareInfo, String str, String str2, C69692g gVar);

    /* renamed from: a */
    void mo109401a(Activity activity, Challenge challenge, List<? extends Aweme> list, String str, boolean z, String str2, String str3, String str4);

    /* renamed from: a */
    void mo109402a(Activity activity, LiveEvent liveEvent, AbstractC69690f fVar, C18288a aVar);

    /* renamed from: a */
    void mo109403a(Activity activity, Music music, C69692g gVar, List<? extends Aweme> list, String str);

    /* renamed from: a */
    void mo109404a(Activity activity, C66289b bVar, C69692g gVar, String str);

    /* renamed from: a */
    void mo109405a(Activity activity, C75445g gVar, String str, List<? extends Aweme> list, String str2);

    /* renamed from: a */
    void mo109406a(Context context);

    /* renamed from: a */
    void mo109407a(Context context, boolean z);

    /* renamed from: a */
    void mo109408a(Handler handler, Activity activity, User user, List<? extends Aweme> list);

    /* renamed from: a */
    void mo109409a(C69684e.C69686b bVar, Activity activity, boolean z);

    /* renamed from: a */
    boolean mo109410a();

    /* renamed from: a */
    boolean mo109411a(Aweme aweme);

    /* renamed from: a */
    boolean mo109412a(C69905c cVar, String str);

    /* renamed from: a */
    boolean mo109413a(String str, String str2, Context context);

    /* renamed from: b */
    Dialog mo109414b(Activity activity, Fragment fragment, Aweme aweme, AbstractC49691s<C49672ag> sVar, Bundle bundle);

    /* renamed from: b */
    Dialog mo109415b(Activity activity, C11666c cVar, AbstractC11665b bVar);

    /* renamed from: b */
    AbstractC63220bg mo109416b();

    /* renamed from: b */
    void mo109417b(Activity activity);

    /* renamed from: c */
    AbstractC68912f mo109418c();

    /* renamed from: c */
    SharePackage mo109419c(Activity activity, C11666c cVar, AbstractC11665b bVar);
}
