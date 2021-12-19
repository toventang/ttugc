package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.bx */
public final class C37080bx extends DialogInterface$OnCancelListenerC0944d {

    /* renamed from: b */
    public static final C37081a f87363b = new C37081a((byte) 0);

    /* renamed from: a */
    public PlayerController f87364a;

    /* renamed from: c */
    private Comment f87365c;

    /* renamed from: d */
    private SparseArray f87366d;

    static {
        Covode.recordClassIndex(44434);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bx$a */
    public static final class C37081a {
        static {
            Covode.recordClassIndex(44435);
        }

        private C37081a() {
        }

        public /* synthetic */ C37081a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C37080bx m74800a(Comment comment) {
            C37080bx bxVar = new C37080bx();
            Bundle bundle = new Bundle();
            bundle.putSerializable(UGCMonitor.EVENT_COMMENT, comment);
            bxVar.setArguments(bundle);
            return bxVar;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f87366d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bx$b */
    public static final class C37082b implements AbstractC58510a {

        /* renamed from: a */
        final /* synthetic */ C37080bx f87367a;

        static {
            Covode.recordClassIndex(44436);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a
        /* renamed from: a */
        public final void mo16674a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a
        /* renamed from: a */
        public final void mo16675a(int i, int i2, C58522a.EnumC58526d dVar) {
            C89219l.m154721d(dVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a
        /* renamed from: b */
        public final void mo16676b() {
            PlayerController playerController = this.f87367a.f87364a;
            if (playerController == null) {
                C89219l.m154715b();
            }
            playerController.mo95953a(8);
            this.f87367a.mo64592a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37082b(C37080bx bxVar) {
            this.f87367a = bxVar;
        }
    }

    /* renamed from: a */
    public final void mo64592a() {
        AbstractC0952i supportFragmentManager;
        Fragment a;
        ActivityC0945e activity;
        AbstractC0952i supportFragmentManager2;
        ActivityC0945e activity2 = getActivity();
        if (activity2 != null && (supportFragmentManager = activity2.getSupportFragmentManager()) != null && (a = supportFragmentManager.mo3551a("GiftAnimationFragment")) != null && (activity = getActivity()) != null && (supportFragmentManager2 = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager2.mo3552a().mo3455a(a).mo3467b();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window3 = dialog.getWindow();
            if (window3 == null) {
                C89219l.m154715b();
            }
            window3.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            Serializable serializable = arguments.getSerializable(UGCMonitor.EVENT_COMMENT);
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.model.Comment");
            this.f87365c = (Comment) serializable;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void show(AbstractC0952i iVar, String str) {
        super.show(iVar, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012c A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0193  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
        // Method dump skipped, instructions count: 413
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37080bx.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        setCancelable(false);
        return C1764a.m5927a(layoutInflater, R.layout.ii, viewGroup, false);
    }
}
