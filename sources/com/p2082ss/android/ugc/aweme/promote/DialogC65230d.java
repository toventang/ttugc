package com.p2082ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3741d.C68793c;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.aweme.views.DialogC81459o;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.promote.d */
public final class DialogC65230d extends DialogC81459o {

    /* renamed from: a */
    public String f147159a;

    /* renamed from: b */
    public String f147160b;

    /* renamed from: c */
    TextView f147161c = ((TextView) this.f147167i.findViewById(R.id.f63));

    /* renamed from: d */
    TextView f147162d = ((TextView) this.f147167i.findViewById(R.id.ev0));

    /* renamed from: e */
    View f147163e = this.f147167i.findViewById(R.id.y1);

    /* renamed from: f */
    View f147164f = this.f147167i.findViewById(R.id.x4);

    /* renamed from: g */
    public Activity f147165g;

    /* renamed from: h */
    private String f147166h;

    /* renamed from: i */
    private View f147167i;

    /* renamed from: j */
    private DialogC81438i f147168j;

    static {
        Covode.recordClassIndex(76706);
    }

    public final void dismiss() {
        super.dismiss();
        DialogC81438i iVar = this.f147168j;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    public DialogC65230d(Activity activity, String str, C68793c cVar) {
        super(activity, R.style.zn, false, true);
        MethodCollector.m26663i(7272);
        this.f147165g = activity;
        this.f147166h = str;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.x8, (ViewGroup) null);
        this.f147167i = inflate;
        setContentView(inflate);
        Activity activity2 = this.f147165g;
        if (activity2 != null) {
            this.f147159a = activity2.getString(R.string.d9a);
            this.f147160b = this.f147165g.getString(R.string.d99);
        }
        if (cVar != null) {
            if (!TextUtils.isEmpty(cVar.mo109260d())) {
                this.f147159a = cVar.mo109260d();
            }
            if (!TextUtils.isEmpty(cVar.mo109262f())) {
                this.f147160b = cVar.mo109262f();
            }
            String a = cVar.mo109257a();
            if (!TextUtils.isEmpty(a)) {
                this.f147161c.setText(a);
            }
            String b = cVar.mo109258b();
            if (!TextUtils.isEmpty(b)) {
                this.f147162d.setText(b);
            }
            String c = cVar.mo109259c();
            if (!TextUtils.isEmpty(c)) {
                this.f147163e.setContentDescription(c);
            }
            String e = cVar.mo109261e();
            if (!TextUtils.isEmpty(e)) {
                this.f147164f.setContentDescription(e);
            }
        }
        this.f147163e.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.promote.DialogC65230d.View$OnClickListenerC652311 */

            static {
                Covode.recordClassIndex(76707);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                Activity activity = DialogC65230d.this.f147165g;
                String str = DialogC65230d.this.f147159a;
                if (activity != null) {
                    Intent intent = new Intent(activity, CrossPlatformActivity.class);
                    Bundle bundle = new Bundle();
                    if (TextUtils.isEmpty(str)) {
                        str = "https://www.tiktok.com/aweme/inapp/v2/ad_agreement?hide_nav_bar=1";
                    }
                    intent.setData(Uri.parse(str));
                    intent.putExtra("hide_nav_bar", true);
                    String str2 = "";
                    if (TextUtils.isEmpty(str2)) {
                        str2 = activity.getResources().getString(R.string.exd);
                    }
                    intent.putExtra("title", str2);
                    intent.putExtra("aweme_model", bundle);
                    C84349a.m145093a(intent, activity);
                    activity.startActivity(intent);
                }
                DialogC65230d.this.dismiss();
            }
        });
        this.f147164f.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.promote.DialogC65230d.View$OnClickListenerC652322 */

            static {
                Covode.recordClassIndex(76708);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                new C23144b(DialogC65230d.this.f147165g).mo37635a(DialogC65230d.this.f147160b).mo37637b();
                DialogC65230d.this.dismiss();
            }
        });
        MethodCollector.m26664o(7272);
    }
}
