package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui;

import android.content.Context;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a */
public abstract class EnumC55388a extends Enum<EnumC55388a> {
    public static final EnumC55388a ADD_MEMBER;
    public static final EnumC55388a CREATE_GROUP;

    /* renamed from: a */
    private static final /* synthetic */ EnumC55388a[] f126640a;

    static {
        Covode.recordClassIndex(65159);
        C55391b bVar = new C55391b("CREATE_GROUP");
        CREATE_GROUP = bVar;
        C55389a aVar = new C55389a("ADD_MEMBER");
        ADD_MEMBER = aVar;
        f126640a = new EnumC55388a[]{bVar, aVar};
    }

    public static EnumC55388a valueOf(String str) {
        return (EnumC55388a) Enum.valueOf(EnumC55388a.class, str);
    }

    public static EnumC55388a[] values() {
        return (EnumC55388a[]) f126640a.clone();
    }

    public abstract boolean getShowJoinedGroupsHeader();

    public abstract String sendBtnText(int i);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a$a */
    static final class C55389a extends EnumC55388a {

        /* renamed from: a */
        private final boolean f126641a;

        static {
            Covode.recordClassIndex(65160);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.EnumC55388a
        public final boolean getShowJoinedGroupsHeader() {
            return this.f126641a;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a$a$a */
        public static final class C55390a implements ImTextTitleBar.AbstractC55309a {

            /* renamed from: a */
            final /* synthetic */ C55389a f126642a;

            /* renamed from: b */
            final /* synthetic */ AbstractC34586a f126643b;

            static {
                Covode.recordClassIndex(65161);
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
            /* renamed from: a */
            public final void mo91162a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
            /* renamed from: b */
            public final void mo91164b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
            /* renamed from: c */
            public final void mo91165c() {
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
            /* renamed from: a */
            public final void mo91163a(int i) {
                C55389a.m101211a(this.f126643b);
            }

            C55390a(C55389a aVar, AbstractC34586a aVar2) {
                this.f126642a = aVar;
                this.f126643b = aVar2;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55389a(String str) {
            super(str, 1, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.EnumC55388a
        public final String sendBtnText(int i) {
            String string;
            if (i < 2) {
                string = m101210a().getString(R.string.c7s);
            } else {
                string = m101210a().getString(R.string.c7t, Integer.valueOf(i));
            }
            C89219l.m154716b(string, "");
            return string;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.EnumC55388a
        public final void setupTitleBar(ImTextTitleBar imTextTitleBar, AbstractC34586a aVar) {
            C89219l.m154721d(imTextTitleBar, "");
            C89219l.m154721d(aVar, "");
            EnumC55388a.super.setupTitleBar(imTextTitleBar, aVar);
            imTextTitleBar.setTitle(R.string.c5m);
            imTextTitleBar.setLeftText("");
            imTextTitleBar.setRightIcon(R.raw.icon_x_mark_small);
            imTextTitleBar.setOnTitlebarClickListener(new C55390a(this, aVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a$b */
    static final class C55391b extends EnumC55388a {

        /* renamed from: a */
        private final boolean f126644a = true;

        static {
            Covode.recordClassIndex(65162);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.EnumC55388a
        public final boolean getShowJoinedGroupsHeader() {
            return this.f126644a;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a$b$a */
        public static final class C55392a implements ImTextTitleBar.AbstractC55309a {

            /* renamed from: a */
            final /* synthetic */ C55391b f126645a;

            /* renamed from: b */
            final /* synthetic */ AbstractC34586a f126646b;

            static {
                Covode.recordClassIndex(65163);
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
            /* renamed from: a */
            public final void mo91163a(int i) {
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
            /* renamed from: b */
            public final void mo91164b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
            /* renamed from: c */
            public final void mo91165c() {
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
            /* renamed from: a */
            public final void mo91162a() {
                C55391b.m101211a(this.f126646b);
            }

            C55392a(C55391b bVar, AbstractC34586a aVar) {
                this.f126645a = bVar;
                this.f126646b = aVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55391b(String str) {
            super(str, 0, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.EnumC55388a
        public final String sendBtnText(int i) {
            String string;
            if (i < 2) {
                string = m101210a().getString(R.string.c7p);
            } else {
                string = m101210a().getString(R.string.c7r, Integer.valueOf(i));
            }
            C89219l.m154716b(string, "");
            return string;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.EnumC55388a
        public final void setupTitleBar(ImTextTitleBar imTextTitleBar, AbstractC34586a aVar) {
            C89219l.m154721d(imTextTitleBar, "");
            C89219l.m154721d(aVar, "");
            EnumC55388a.super.setupTitleBar(imTextTitleBar, aVar);
            imTextTitleBar.setTitle(R.string.c6l);
            imTextTitleBar.setLeftText(R.string.cck);
            imTextTitleBar.setOnTitlebarClickListener(new C55392a(this, aVar));
        }
    }

    /* renamed from: a */
    protected static Context m101210a() {
        return C17867d.m33078a();
    }

    /* renamed from: a */
    protected static void m101211a(AbstractC34586a aVar) {
        C89219l.m154721d(aVar, "");
        AbstractC0952i fragmentManager = aVar.getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.mo3552a().mo3455a(aVar);
        }
        ActivityC0945e activity = aVar.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    private EnumC55388a(String str, int i) {
    }

    public void setupTitleBar(ImTextTitleBar imTextTitleBar, AbstractC34586a aVar) {
        C89219l.m154721d(imTextTitleBar, "");
        C89219l.m154721d(aVar, "");
        C55076b.m100725d().setupStatusBar(aVar.getActivity());
    }

    public /* synthetic */ EnumC55388a(String str, int i, C89214g gVar) {
        this(str, i);
    }
}
