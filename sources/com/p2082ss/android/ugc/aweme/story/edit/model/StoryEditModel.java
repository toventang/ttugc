package com.p2082ss.android.ugc.aweme.story.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.story.base.model.EditContext;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77119c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.model.StoryEditModel */
public final class StoryEditModel implements Parcelable, AbstractC77119c<StoryEditClipModel>, Serializable {
    public static final C77146a CREATOR = new C77146a((byte) 0);

    /* renamed from: a */
    private ArrayList<StoryEditClipModel> f173054a;

    /* renamed from: b */
    private final String f173055b;

    /* renamed from: c */
    private final String f173056c;

    /* renamed from: d */
    private final int f173057d;

    /* renamed from: e */
    private final boolean f173058e;

    /* renamed from: f */
    private final EditContext f173059f;

    static {
        Covode.recordClassIndex(90152);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.model.StoryEditModel$a */
    public static final class C77146a implements Parcelable.Creator<StoryEditModel> {
        static {
            Covode.recordClassIndex(90153);
        }

        private C77146a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StoryEditModel[] newArray(int i) {
            return new StoryEditModel[i];
        }

        public /* synthetic */ C77146a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StoryEditModel createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new StoryEditModel(parcel);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77119c
    public final List<StoryEditClipModel> getClips() {
        return this.f173054a;
    }

    public final String getCreationId() {
        return this.f173055b;
    }

    public final EditContext getEditContext() {
        return this.f173059f;
    }

    public final int getOrigin() {
        return this.f173057d;
    }

    public final String getShootWay() {
        return this.f173056c;
    }

    public final boolean isMultiContent() {
        return this.f173058e;
    }

    public final void clear() {
        this.f173054a.clear();
    }

    public final boolean remove(StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(storyEditClipModel, "");
        return this.f173054a.remove(storyEditClipModel);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StoryEditModel(android.os.Parcel r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r8, r0)
            java.lang.String r2 = r8.readString()
            if (r2 != 0) goto L_0x000e
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x000e:
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r0)
            java.lang.String r3 = r8.readString()
            if (r3 != 0) goto L_0x001a
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x001a:
            p4600h.p4611f.p4613b.C89219l.m154716b(r3, r0)
            int r4 = r8.readInt()
            byte r1 = r8.readByte()
            r0 = 1
            if (r1 != r0) goto L_0x004b
            r5 = 1
        L_0x0029:
            java.lang.Class<com.ss.android.ugc.aweme.story.base.model.EditContext> r0 = com.p2082ss.android.ugc.aweme.story.base.model.EditContext.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r6 = r8.readParcelable(r0)
            com.ss.android.ugc.aweme.story.base.model.EditContext r6 = (com.p2082ss.android.ugc.aweme.story.base.model.EditContext) r6
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Class<com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel> r0 = com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r1 = r8.readArrayList(r0)
        */
        //  java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel> /* = java.util.ArrayList<com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel> */"
        /*
            java.util.Objects.requireNonNull(r1, r0)
            r7.f173054a = r1
            return
        L_0x004b:
            r0 = 0
            r5 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel.<init>(android.os.Parcel):void");
    }

    public final void add(StoryEditClipModel storyEditClipModel, int i) {
        boolean z;
        C89219l.m154721d(storyEditClipModel, "");
        storyEditClipModel.setCreationId(this.f173055b);
        if (this.f173057d == 0) {
            z = true;
        } else {
            z = false;
        }
        storyEditClipModel.setFastImport(z);
        if (i < 0 || i > this.f173054a.size()) {
            this.f173054a.add(storyEditClipModel);
        } else {
            this.f173054a.add(i, storyEditClipModel);
        }
    }

    public final void swap(StoryEditClipModel storyEditClipModel, StoryEditClipModel storyEditClipModel2) {
        C89219l.m154721d(storyEditClipModel, "");
        C89219l.m154721d(storyEditClipModel2, "");
        ArrayList<StoryEditClipModel> arrayList = this.f173054a;
        int indexOf = arrayList.indexOf(storyEditClipModel);
        int indexOf2 = this.f173054a.indexOf(storyEditClipModel2);
        C89219l.m154721d(arrayList, "");
        if (indexOf != indexOf2 && indexOf >= 0 && indexOf2 >= 0 && indexOf <= arrayList.size() - 1 && indexOf2 <= arrayList.size() - 1) {
            StoryEditClipModel storyEditClipModel3 = arrayList.get(indexOf);
            arrayList.set(indexOf, arrayList.get(indexOf2));
            arrayList.set(indexOf2, storyEditClipModel3);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f173055b);
        parcel.writeString(this.f173056c);
        parcel.writeInt(this.f173057d);
        parcel.writeByte(this.f173058e ? (byte) 1 : 0);
        parcel.writeParcelable(this.f173059f, i);
        parcel.writeList(getClips());
    }

    public StoryEditModel(String str, String str2, int i, boolean z, EditContext editContext) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f173055b = str;
        this.f173056c = str2;
        this.f173057d = i;
        this.f173058e = z;
        this.f173059f = editContext;
        this.f173054a = new ArrayList<>();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryEditModel(String str, String str2, int i, boolean z, EditContext editContext, int i2, C89214g gVar) {
        this(str, str2, i, z, (i2 & 16) != 0 ? null : editContext);
    }
}
