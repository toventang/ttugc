package com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.SocialVideoTagShareVM */
public final class SocialVideoTagShareVM extends AbstractC1174ac {

    /* renamed from: a */
    public final C1213t<Aweme> f86909a = new C1213t<>();

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.SocialVideoTagShareVM$b */
    public static final class C36904b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C36904b f86913a = new C36904b();

        static {
            Covode.recordClassIndex(44244);
        }

        C36904b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(44242);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.SocialVideoTagShareVM$a */
    public static final class C36903a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Aweme f86910a;

        /* renamed from: b */
        final /* synthetic */ String f86911b;

        /* renamed from: c */
        final /* synthetic */ SocialVideoTagShareVM f86912c;

        static {
            Covode.recordClassIndex(44243);
        }

        public C36903a(Aweme aweme, String str, SocialVideoTagShareVM socialVideoTagShareVM) {
            this.f86910a = aweme;
            this.f86911b = str;
            this.f86912c = socialVideoTagShareVM;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ArrayList arrayList;
            List<InteractionTagUserInfo> taggedUsers;
            InteractionTagInfo interactionTagInfo = this.f86910a.getInteractionTagInfo();
            if (interactionTagInfo == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (T t : taggedUsers) {
                    if (!TextUtils.equals(this.f86911b, t.getUid())) {
                        arrayList2.add(t);
                    }
                }
                arrayList = arrayList2;
            }
            InteractionTagInfo interactionTagInfo2 = this.f86910a.getInteractionTagInfo();
            if (interactionTagInfo2 != null) {
                interactionTagInfo2.setTaggedUsers(arrayList);
            }
            this.f86912c.f86909a.postValue(this.f86910a);
        }
    }
}
