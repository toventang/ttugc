package com.p2082ss.android.ugc.aweme.setting.p3715c;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.livedata.C34603a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.p3070im.C53602f;
import com.p2082ss.android.ugc.aweme.profile.api.BlockApi;
import com.p2082ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p2082ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.utils.C68691f;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.setting.c.a */
public final class View$OnClickListenerC68045a extends RecyclerView.ViewHolder implements View.OnClickListener, WeakHandler.IHandler {

    /* renamed from: a */
    AvatarImageView f152415a;

    /* renamed from: b */
    TextView f152416b;

    /* renamed from: c */
    TextView f152417c;

    /* renamed from: d */
    View f152418d;

    /* renamed from: e */
    User f152419e;

    /* renamed from: f */
    int f152420f;

    /* renamed from: g */
    int f152421g;

    /* renamed from: h */
    boolean f152422h;

    /* renamed from: i */
    private Activity f152423i;

    /* renamed from: j */
    private Button f152424j;

    /* renamed from: k */
    private WeakHandler f152425k = new WeakHandler(this);

    static {
        Covode.recordClassIndex(80241);
    }

    /* renamed from: a */
    private static boolean m120347a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo108662a(boolean z) {
        int i;
        int i2;
        int i3;
        if (z) {
            Button button = this.f152424j;
            if (this.f152422h) {
                i2 = R.string.h0c;
            } else {
                i2 = R.string.h0b;
            }
            button.setText(i2);
            Button button2 = this.f152424j;
            if (this.f152421g == 0) {
                i3 = R.drawable.b0v;
            } else {
                i3 = R.drawable.b0w;
            }
            button2.setBackgroundResource(i3);
            this.f152424j.setTextColor(C0643b.m2378c(C17867d.m33078a(), R.color.bx));
            return;
        }
        Button button3 = this.f152424j;
        if (this.f152422h) {
            i = R.string.a67;
        } else {
            i = R.string.a64;
        }
        button3.setText(i);
        this.f152424j.setBackgroundResource(R.drawable.b0u);
        this.f152424j.setTextColor(C0643b.m2378c(C17867d.m33078a(), R.color.a_));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo108663b(boolean z) {
        BlockApi.m115012a(this.f152425k, this.f152419e.getUid(), this.f152419e.getSecUid(), !z ? 1 : 0, this.f152420f);
        if (z) {
            C68691f.m121124a(this.f152419e.getUid());
            C53602f.m98839a("black_list", this.f152419e.getUid());
            return;
        }
        C68691f.m121124a(this.f152419e.getUid());
        C53602f.m98840a("black_list", this.f152419e.getUid(), "");
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        int i;
        int i2;
        if (!this.f152423i.isFinishing()) {
            int i3 = message.what;
            Object obj = message.obj;
            if (i3 == 31 || i3 == 32) {
                if (obj instanceof ExecutionException) {
                    obj = ((ExecutionException) obj).getCause();
                }
                if (obj instanceof C34485a) {
                    new C79459a(C17867d.m33078a()).mo123052a(((C34485a) obj).getErrorMsg()).mo123053a();
                } else if (obj instanceof Exception) {
                    new C79459a(C17867d.m33078a()).mo123050a(R.string.dck).mo123053a();
                } else if (obj instanceof BlockStruct) {
                    int i4 = ((BlockStruct) obj).blockStatus;
                    boolean z = true;
                    if (i4 != 1) {
                        z = false;
                    }
                    if (i3 == 32) {
                        StoryBlockInfo storyBlockInfo = this.f152419e.getStoryBlockInfo();
                        if (storyBlockInfo == null) {
                            storyBlockInfo = new StoryBlockInfo();
                            this.f152419e.setStoryBlockInfo(storyBlockInfo);
                        }
                        storyBlockInfo.setBlock(z);
                        mo108662a(storyBlockInfo.isBlock());
                        Resources resources = this.f152423i.getResources();
                        if (z) {
                            i2 = R.string.a68;
                        } else {
                            i2 = R.string.h0d;
                        }
                        new C79459a(C17867d.m33078a()).mo123052a(resources.getString(i2)).mo123053a();
                    } else {
                        this.f152419e.setBlock(z);
                        Activity activity = this.f152423i;
                        if (activity != null) {
                            C79459a aVar = new C79459a(activity);
                            Resources resources2 = activity.getResources();
                            if (z) {
                                i = R.string.sx;
                            } else {
                                i = R.string.h0b;
                            }
                            aVar.mo123052a(resources2.getString(i)).mo123053a();
                        }
                        mo108662a(this.f152419e.isBlock());
                    }
                    C34603a.C34604a.f81659a.mo61063a("aweme.main.profile.more_page_user_info_change").postValue(this.f152419e);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r5) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.p3715c.View$OnClickListenerC68045a.onClick(android.view.View):void");
    }

    public View$OnClickListenerC68045a(View view, Activity activity) {
        super(view);
        this.f152423i = activity;
        this.f152415a = (AvatarImageView) view.findViewById(R.id.so);
        this.f152416b = (TextView) view.findViewById(R.id.sp);
        this.f152417c = (TextView) view.findViewById(R.id.sq);
        this.f152418d = view.findViewById(R.id.sr);
        this.f152424j = (Button) view.findViewById(R.id.sn);
        C62023a.m112168a(this.f152418d);
        C62023a.m112168a(this.f152424j);
        this.f152418d.setOnClickListener(this);
        this.f152424j.setOnClickListener(this);
    }
}
