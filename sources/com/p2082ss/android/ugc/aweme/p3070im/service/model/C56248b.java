package com.p2082ss.android.ugc.aweme.p3070im.service.model;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56231a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.b */
public final class C56248b {

    /* renamed from: i */
    public static final C56249a f128282i = new C56249a((byte) 0);

    /* renamed from: a */
    public User f128283a;

    /* renamed from: b */
    public View f128284b;

    /* renamed from: c */
    public TextView f128285c;

    /* renamed from: d */
    public int f128286d = -1;

    /* renamed from: e */
    public Object f128287e;

    /* renamed from: f */
    public String f128288f = "";

    /* renamed from: g */
    public final String f128289g = "follow_button";

    /* renamed from: h */
    public final Activity f128290h;

    static {
        Covode.recordClassIndex(66061);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C56248b) && C89219l.m154714a(this.f128290h, ((C56248b) obj).f128290h);
        }
        return true;
    }

    public final int hashCode() {
        Activity activity = this.f128290h;
        if (activity != null) {
            return activity.hashCode();
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.model.b$a */
    public static final class C56249a {
        static {
            Covode.recordClassIndex(66062);
        }

        private C56249a() {
        }

        public /* synthetic */ C56249a(byte b) {
            this();
        }
    }

    public final String toString() {
        String str;
        Integer num;
        StringBuilder append = new StringBuilder("FollowWrap{").append(this.f128290h).append(", ");
        User user = this.f128283a;
        Integer num2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        StringBuilder append2 = append.append(str).append(", ");
        User user2 = this.f128283a;
        if (user2 != null) {
            num = Integer.valueOf(user2.getFollowStatus());
        } else {
            num = null;
        }
        StringBuilder append3 = append2.append(num).append(", ");
        User user3 = this.f128283a;
        if (user3 != null) {
            num2 = Integer.valueOf(user3.getFollowerStatus());
        }
        return append3.append(num2).append('}').toString();
    }

    /* renamed from: a */
    public final void mo93285a() {
        AbstractC56231a familiarService = IMService.createIIMServicebyMonsterPlugin(false).getFamiliarService();
        if (familiarService != null) {
            familiarService.mo92289a(this);
        }
    }

    /* renamed from: a */
    public final C56248b mo93279a(int i) {
        this.f128286d = i;
        return this;
    }

    /* renamed from: a */
    public static final C56248b m102215a(Activity activity) {
        return new C56248b(activity);
    }

    /* renamed from: a */
    public final C56248b mo93280a(View view) {
        this.f128284b = view;
        return this;
    }

    private C56248b(Activity activity) {
        this.f128290h = activity;
    }

    /* renamed from: a */
    public final C56248b mo93281a(TextView textView) {
        this.f128285c = textView;
        return this;
    }

    /* renamed from: a */
    public final C56248b mo93282a(User user) {
        this.f128283a = user;
        return this;
    }

    /* renamed from: a */
    public final C56248b mo93283a(Object obj) {
        this.f128287e = obj;
        return this;
    }

    /* renamed from: a */
    public final C56248b mo93284a(String str) {
        if (str == null) {
            str = "";
        }
        this.f128288f = str;
        return this;
    }

    /* renamed from: a */
    public final void mo93286a(AbstractC89172b<? super C56250c, C89391z> bVar) {
        C56250c cVar;
        C89219l.m154721d(bVar, "");
        AbstractC56231a familiarService = IMService.createIIMServicebyMonsterPlugin(false).getFamiliarService();
        if (familiarService != null) {
            cVar = familiarService.mo92290b(this);
        } else {
            cVar = null;
        }
        bVar.invoke(cVar);
    }
}
