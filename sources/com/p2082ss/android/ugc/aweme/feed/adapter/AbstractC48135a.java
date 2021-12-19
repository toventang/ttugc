package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.api.C48337k;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.a */
public abstract class AbstractC48135a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public int f111525a = -1;

    static {
        Covode.recordClassIndex(56877);
    }

    /* renamed from: a */
    private static boolean m91330a() {
        try {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC58593c d = s.mo95830d();
            C89219l.m154716b(d, "");
            return d.mo13038s().mo13045a();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC48135a(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    /* renamed from: a */
    private static String m91328a(Context context) {
        C89219l.m154721d(context, "");
        try {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC58593c d = s.mo95830d();
            C89219l.m154716b(d, "");
            String a = d.mo13037r().mo12968a(context);
            C89219l.m154716b(a, "");
            return a;
        } catch (Exception unused) {
            return "LIVE";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo80264a(TextView textView) {
        String str;
        C89219l.m154721d(textView, "");
        try {
            if (m91330a()) {
                Context context = textView.getContext();
                C89219l.m154716b(context, "");
                str = m91328a(context);
            } else {
                str = "LIVE";
            }
            textView.setText(str);
            m91329a(textView, str, 12.0f);
        } catch (Exception unused) {
            textView.setText("LIVE");
            m91329a(textView, "LIVE", 12.0f);
        }
    }

    /* renamed from: a */
    private static void m91329a(TextView textView, String str, float f) {
        do {
            textView.setTextSize(1, f);
            if (textView.getPaint().measureText(str) > C13628n.m24520b(textView.getContext(), 46.0f)) {
                f -= 1.0f;
            } else {
                return;
            }
        } while (f >= 10.0f);
    }

    /* renamed from: a */
    public final void mo80263a(Context context, C48337k kVar, List<C48337k> list, int... iArr) {
        User user;
        String str;
        String str2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(iArr, "");
        if (kVar != null && (user = kVar.getUser()) != null) {
            long j = user.roomId;
            String str3 = kVar.getUser().roomData;
            if (str3 != null) {
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(it.next().getUser().roomId));
                    }
                }
                Rect rect = new Rect();
                int[] a = C89064i.m154490a(new Integer[]{0, 0});
                this.itemView.getLocationOnScreen(a);
                rect.left = a[0];
                rect.top = a[1];
                rect.right = a[0] + a[0];
                rect.bottom = a[1] + a[1];
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.f28233c.f28290G = rect;
                enterRoomConfig.f28233c.f28291H = C89070n.m154582f((Collection<Long>) arrayList);
                enterRoomConfig.f28233c.f28295L = "live_cover";
                EnterRoomConfig.LogData logData = enterRoomConfig.f28232b;
                User user2 = kVar.getUser();
                if (user2 == null || (str = user2.getUid()) == null) {
                    str = "0";
                }
                logData.f28258b = str;
                enterRoomConfig.f28233c.f28321ab = "click";
                EnterRoomConfig.LogData logData2 = enterRoomConfig.f28232b;
                LogPbBean logPbBean = kVar.getLogPbBean();
                if (logPbBean != null) {
                    str2 = logPbBean.getImprId();
                } else {
                    str2 = null;
                }
                logData2.f28257a = String.valueOf(str2);
                enterRoomConfig.f28233c.f28301R = j;
                enterRoomConfig.f28233c.f28293J = "homepage_follow";
                enterRoomConfig.f28233c.f28291H = C89070n.m154582f((Collection<Long>) arrayList);
                enterRoomConfig.f28232b.f28256M = this.f111525a;
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                s.mo95835i().mo105591a(context, enterRoomConfig, str3);
                C39162r.m79460a("click_play_following_window", new C33744d().mo59983a("is_live", "1").f79943a);
            }
        }
    }
}
