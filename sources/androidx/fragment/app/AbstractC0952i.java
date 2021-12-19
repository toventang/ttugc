package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: androidx.fragment.app.i */
public abstract class AbstractC0952i {

    /* renamed from: androidx.fragment.app.i$a */
    public interface AbstractC0953a {
        static {
            Covode.recordClassIndex(1046);
        }

        /* renamed from: h */
        String mo3481h();
    }

    /* renamed from: androidx.fragment.app.i$b */
    public static abstract class AbstractC0954b {
        static {
            Covode.recordClassIndex(1047);
        }

        public void onFragmentActivityCreated(AbstractC0952i iVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(AbstractC0952i iVar, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(AbstractC0952i iVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(AbstractC0952i iVar, Fragment fragment) {
        }

        public void onFragmentDetached(AbstractC0952i iVar, Fragment fragment) {
        }

        public void onFragmentPaused(AbstractC0952i iVar, Fragment fragment) {
        }

        public void onFragmentPreAttached(AbstractC0952i iVar, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(AbstractC0952i iVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(AbstractC0952i iVar, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(AbstractC0952i iVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(AbstractC0952i iVar, Fragment fragment) {
        }

        public void onFragmentStopped(AbstractC0952i iVar, Fragment fragment) {
        }

        public void onFragmentViewCreated(AbstractC0952i iVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(AbstractC0952i iVar, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.i$c */
    public interface AbstractC0955c {
        static {
            Covode.recordClassIndex(1048);
        }

        /* renamed from: a */
        void mo3582a();
    }

    static {
        Covode.recordClassIndex(1045);
    }

    /* renamed from: a */
    public abstract Fragment.SavedState mo3548a(Fragment fragment);

    /* renamed from: a */
    public abstract Fragment mo3549a(int i);

    /* renamed from: a */
    public abstract Fragment mo3550a(Bundle bundle, String str);

    /* renamed from: a */
    public abstract Fragment mo3551a(String str);

    /* renamed from: a */
    public abstract AbstractC0976n mo3552a();

    /* renamed from: a */
    public abstract void mo3553a(Bundle bundle, String str, Fragment fragment);

    /* renamed from: a */
    public abstract void mo3554a(AbstractC0954b bVar);

    /* renamed from: a */
    public abstract void mo3555a(AbstractC0954b bVar, boolean z);

    /* renamed from: a */
    public abstract void mo3556a(AbstractC0955c cVar);

    /* renamed from: a */
    public abstract void mo3557a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract void mo3558b(int i);

    /* renamed from: b */
    public abstract void mo3559b(AbstractC0955c cVar);

    /* renamed from: b */
    public abstract boolean mo3560b();

    /* renamed from: c */
    public abstract AbstractC0953a mo3561c(int i);

    /* renamed from: c */
    public abstract void mo3562c();

    /* renamed from: d */
    public abstract boolean mo3563d();

    /* renamed from: e */
    public abstract int mo3564e();

    /* renamed from: f */
    public abstract List<Fragment> mo3565f();

    /* renamed from: g */
    public abstract boolean mo3566g();

    /* renamed from: h */
    public abstract boolean mo3567h();
}
