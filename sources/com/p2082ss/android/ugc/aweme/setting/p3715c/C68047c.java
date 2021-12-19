package com.p2082ss.android.ugc.aweme.setting.p3715c;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.c.c */
public final class C68047c extends AbstractC39060f<User> {

    /* renamed from: a */
    protected Activity f152427a;

    static {
        Covode.recordClassIndex(80243);
    }

    public C68047c(Activity activity) {
        this.f152427a = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        int c = C0643b.m2378c(viewGroup.getContext(), R.color.c5);
        mo67819f(c);
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextColor(c);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setText(R.string.cer);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setTextColor(c);
        appCompatTextView2.setTextSize(13.0f);
        appCompatTextView2.setText(R.string.fzs);
        DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
        dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27406b(appCompatTextView2));
        return a_;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        return new View$OnClickListenerC68045a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ay2, viewGroup, false), this.f152427a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        String uniqueId;
        View$OnClickListenerC68045a aVar = (View$OnClickListenerC68045a) viewHolder;
        User user = (User) this.f92236l.get(i);
        if (user != null) {
            boolean z = false;
            aVar.f152421g = 0;
            if (aVar.f152421g != 0) {
                aVar.f152418d.setBackgroundColor(aVar.f152418d.getResources().getColor(R.color.a9));
                aVar.f152416b.setTextColor(aVar.f152418d.getResources().getColor(R.color.ai));
                aVar.f152417c.setTextColor(aVar.f152418d.getResources().getColor(R.color.c2));
            }
            aVar.f152420f = 0;
            if (aVar.f152420f == 1) {
                z = true;
            }
            aVar.f152422h = z;
            aVar.f152419e = user;
            StoryBlockInfo storyBlockInfo = aVar.f152419e.getStoryBlockInfo();
            if (aVar.f152422h) {
                if (storyBlockInfo == null) {
                    StoryBlockInfo storyBlockInfo2 = new StoryBlockInfo();
                    storyBlockInfo2.setBlock(true);
                    aVar.f152419e.setStoryBlockInfo(storyBlockInfo2);
                }
                aVar.mo108662a(true);
            } else {
                aVar.mo108662a(aVar.f152419e.isBlock);
            }
            C34577e.m70592a(aVar.f152415a, aVar.f152419e.getAvatarThumb());
            aVar.f152416b.setText(aVar.f152419e.getNickname());
            TextView textView = aVar.f152417c;
            StringBuilder sb = new StringBuilder("@");
            if (TextUtils.isEmpty(user.getUniqueId())) {
                uniqueId = user.getShortId();
            } else {
                uniqueId = user.getUniqueId();
            }
            textView.setText(sb.append(uniqueId).toString());
        }
    }
}
