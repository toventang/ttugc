package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64315z;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v */
public final class DialogC64175v extends Dialog {

    /* renamed from: b */
    public static final C64176a f145547b = new C64176a((byte) 0);

    /* renamed from: a */
    final Activity f145548a;

    /* renamed from: c */
    private final int f145549c;

    /* renamed from: d */
    private final int f145550d;

    /* renamed from: e */
    private final int f145551e;

    /* renamed from: f */
    private final int f145552f;

    /* renamed from: g */
    private final User f145553g;

    static {
        Covode.recordClassIndex(75620);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v$a */
    public static final class C64176a {
        static {
            Covode.recordClassIndex(75621);
        }

        private C64176a() {
        }

        public /* synthetic */ C64176a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v$d */
    public static final class View$OnLongClickListenerC64179d implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC64175v f145560a;

        /* renamed from: b */
        final /* synthetic */ View f145561b;

        static {
            Covode.recordClassIndex(75624);
        }

        View$OnLongClickListenerC64179d(DialogC64175v vVar, View view) {
            this.f145560a = vVar;
            this.f145561b = view;
        }

        public final boolean onLongClick(View view) {
            this.f145560a.dismiss();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v$h */
    static final class View$OnClickListenerC64183h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC64175v f145562a;

        static {
            Covode.recordClassIndex(75628);
        }

        View$OnClickListenerC64183h(DialogC64175v vVar) {
            this.f145562a = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f145562a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v$i */
    static final class View$OnClickListenerC64184i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC64175v f145563a;

        static {
            Covode.recordClassIndex(75629);
        }

        View$OnClickListenerC64184i(DialogC64175v vVar) {
            this.f145563a = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f145563a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v$c */
    public static final class View$OnClickListenerC64178c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64177b f145557a;

        /* renamed from: b */
        final /* synthetic */ DialogC64175v f145558b;

        /* renamed from: c */
        final /* synthetic */ View f145559c;

        static {
            Covode.recordClassIndex(75623);
        }

        View$OnClickListenerC64178c(C64177b bVar, DialogC64175v vVar, View view) {
            this.f145557a = bVar;
            this.f145558b = vVar;
            this.f145559c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f145557a.f145556c.invoke(this.f145557a.f145555b);
            this.f145558b.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v$f */
    static final /* synthetic */ class C64181f extends C89217j implements AbstractC89172b<String, C89391z> {
        static {
            Covode.recordClassIndex(75626);
        }

        C64181f(DialogC64175v vVar) {
            super(1, vVar, DialogC64175v.class, "showPhoneDialog", "showPhoneDialog(Ljava/lang/String;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            Activity activity = ((DialogC64175v) this.receiver).f145548a;
            if (!(activity == null || str2 == null)) {
                new DialogC64389x(activity, str2, (byte) 0).show();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v$g */
    static final /* synthetic */ class C64182g extends C89217j implements AbstractC89172b<String, C89391z> {
        static {
            Covode.recordClassIndex(75627);
        }

        C64182g(DialogC64175v vVar) {
            super(1, vVar, DialogC64175v.class, "showMapDialog", "showMapDialog(Ljava/lang/String;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            Activity activity = ((DialogC64175v) this.receiver).f145548a;
            if (!(activity == null || str2 == null)) {
                new DialogC64322w(activity, str2, (byte) 0).show();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v$e */
    static final /* synthetic */ class C64180e extends C89217j implements AbstractC89172b<String, C89391z> {
        static {
            Covode.recordClassIndex(75625);
        }

        C64180e(DialogC64175v vVar) {
            super(1, vVar, DialogC64175v.class, "mailTo", "mailTo(Ljava/lang/String;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            DialogC64175v vVar = (DialogC64175v) this.receiver;
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:".concat(String.valueOf(str))));
            try {
                Activity activity = vVar.f145548a;
                C84349a.m145093a(intent, activity);
                activity.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m116104a(List<C64177b> list) {
        MethodCollector.m26663i(7867);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = new View(this.f145548a);
            view.setBackgroundColor(C0643b.m2378c(view.getContext(), R.color.b2));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f145550d);
            if (i == 0) {
                int i2 = this.f145549c;
                layoutParams.setMargins(i2, i2, i2, i2);
            } else {
                int i3 = this.f145552f;
                int i4 = this.f145549c;
                layoutParams.setMargins(i3, i4, this.f145551e, i4);
            }
            view.setLayoutParams(layoutParams);
            ((LinearLayout) findViewById(R.id.ccp)).addView(view);
            View a = C1764a.m5927a(LayoutInflater.from(this.f145548a), R.layout.ano, (ViewGroup) findViewById(R.id.ccp), false);
            C64177b bVar = list.get(i);
            ((ImageView) a.findViewById(R.id.bwm)).setImageResource(bVar.f145554a);
            View findViewById = a.findViewById(R.id.f5s);
            C89219l.m154716b(findViewById, "");
            ((TextView) findViewById).setText(bVar.f145555b);
            a.setOnClickListener(new View$OnClickListenerC64178c(bVar, this, a));
            a.setOnLongClickListener(new View$OnLongClickListenerC64179d(this, a));
            ((LinearLayout) findViewById(R.id.ccp)).addView(a);
        }
        MethodCollector.m26664o(7867);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.amj);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, C13628n.m24521b(window.getContext()) - C13628n.m24525e(window.getContext()));
            window.setGravity(80);
            window.getAttributes().gravity = 80;
        }
        setCanceledOnTouchOutside(true);
        ((ImageView) findViewById(R.id.bu5)).setOnClickListener(new View$OnClickListenerC64183h(this));
        findViewById(R.id.ffn).setOnClickListener(new View$OnClickListenerC64184i(this));
        ArrayList arrayList = new ArrayList();
        String bioEmail = this.f145553g.getBioEmail();
        if (bioEmail != null && C64315z.m116188a(bioEmail)) {
            String bioEmail2 = this.f145553g.getBioEmail();
            C89219l.m154716b(bioEmail2, "");
            arrayList.add(new C64177b(2131233441, bioEmail2, new C64180e(this)));
        }
        String bioPhone = this.f145553g.getBioPhone();
        if (bioPhone != null && C64315z.m116188a(bioPhone)) {
            String bioPhone2 = this.f145553g.getBioPhone();
            C89219l.m154716b(bioPhone2, "");
            arrayList.add(new C64177b(2131233443, bioPhone2, new C64181f(this)));
        }
        String bioLocation = this.f145553g.getBioLocation();
        if (bioLocation != null && C64315z.m116188a(bioLocation)) {
            String bioLocation2 = this.f145553g.getBioLocation();
            C89219l.m154716b(bioLocation2, "");
            arrayList.add(new C64177b(2131233442, bioLocation2, new C64182g(this)));
        }
        m116104a(arrayList);
    }

    private DialogC64175v(Activity activity, User user) {
        super(activity, R.style.a04);
        this.f145548a = activity;
        this.f145553g = user;
        this.f145550d = (int) C13628n.m24520b(activity, 0.5f);
        this.f145551e = (int) C13628n.m24520b(activity, 16.0f);
        this.f145552f = (int) C13628n.m24520b(activity, 52.0f);
    }

    public /* synthetic */ DialogC64175v(Activity activity, User user, byte b) {
        this(activity, user);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v$b */
    public static final class C64177b {

        /* renamed from: a */
        public final int f145554a;

        /* renamed from: b */
        public final String f145555b;

        /* renamed from: c */
        public final AbstractC89172b<String, C89391z> f145556c;

        static {
            Covode.recordClassIndex(75622);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C64177b)) {
                return false;
            }
            C64177b bVar = (C64177b) obj;
            return this.f145554a == bVar.f145554a && C89219l.m154714a(this.f145555b, bVar.f145555b) && C89219l.m154714a(this.f145556c, bVar.f145556c);
        }

        public final int hashCode() {
            int i = this.f145554a * 31;
            String str = this.f145555b;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            AbstractC89172b<String, C89391z> bVar = this.f145556c;
            if (bVar != null) {
                i2 = bVar.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "ListItem(icon=" + this.f145554a + ", text=" + this.f145555b + ", onItemClick=" + this.f145556c + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.String, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public C64177b(int i, String str, AbstractC89172b<? super String, C89391z> bVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(bVar, "");
            this.f145554a = i;
            this.f145555b = str;
            this.f145556c = bVar;
        }
    }
}
