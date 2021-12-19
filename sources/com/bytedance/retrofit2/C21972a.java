package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.retrofit2.a */
public final class C21972a extends AbstractC22043e.AbstractC22044a {
    static {
        Covode.recordClassIndex(25661);
    }

    /* renamed from: com.bytedance.retrofit2.a$a */
    static final class C21973a implements AbstractC22043e<TypedInput, TypedInput> {

        /* renamed from: a */
        static final C21973a f52008a = new C21973a();

        C21973a() {
        }

        static {
            Covode.recordClassIndex(25662);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.AbstractC22043e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ TypedInput mo11580a(TypedInput typedInput) {
            return m41348a(typedInput);
        }

        /* renamed from: a */
        private static TypedInput m41348a(TypedInput typedInput) {
            MethodCollector.m26663i(12305);
            if (typedInput == null || (typedInput instanceof TypedByteArray)) {
                MethodCollector.m26664o(12305);
                return typedInput;
            }
            String mimeType = typedInput.mimeType();
            InputStream in = typedInput.mo11577in();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (in != null) {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = in.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                return new TypedByteArray(mimeType, byteArrayOutputStream.toByteArray(), new String[0]);
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException unused) {
                    }
                }
                MethodCollector.m26664o(12305);
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$b */
    static final class C21974b implements AbstractC22043e<C22027b, C22027b> {

        /* renamed from: a */
        static final C21974b f52009a = new C21974b();

        C21974b() {
        }

        static {
            Covode.recordClassIndex(25663);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.AbstractC22043e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C22027b mo11580a(C22027b bVar) {
            return bVar;
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$c */
    static final class C21975c implements AbstractC22043e<Object, Object> {

        /* renamed from: a */
        static final C21975c f52010a = new C21975c();

        @Override // com.bytedance.retrofit2.AbstractC22043e
        /* renamed from: a */
        public final Object mo11580a(Object obj) {
            return obj;
        }

        C21975c() {
        }

        static {
            Covode.recordClassIndex(25664);
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$d */
    static final class C21976d implements AbstractC22043e<TypedOutput, TypedOutput> {

        /* renamed from: a */
        static final C21976d f52011a = new C21976d();

        C21976d() {
        }

        static {
            Covode.recordClassIndex(25665);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.AbstractC22043e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ TypedOutput mo11580a(TypedOutput typedOutput) {
            return typedOutput;
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$e */
    static final class C21977e implements AbstractC22043e<TypedInput, TypedInput> {

        /* renamed from: a */
        static final C21977e f52012a = new C21977e();

        C21977e() {
        }

        static {
            Covode.recordClassIndex(25666);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.AbstractC22043e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ TypedInput mo11580a(TypedInput typedInput) {
            return typedInput;
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$f */
    static final class C21978f implements AbstractC22043e<String, String> {

        /* renamed from: a */
        static final C21978f f52013a = new C21978f();

        C21978f() {
        }

        static {
            Covode.recordClassIndex(25667);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.AbstractC22043e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ String mo11580a(String str) {
            return str;
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$g */
    static final class C21979g implements AbstractC22043e<TypedInput, String> {

        /* renamed from: a */
        static final C21979g f52014a = new C21979g();

        C21979g() {
        }

        static {
            Covode.recordClassIndex(25668);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.AbstractC22043e
        /* renamed from: a */
        public final /* synthetic */ String mo11580a(TypedInput typedInput) {
            TypedInput typedInput2 = typedInput;
            if (!(typedInput2 instanceof TypedByteArray)) {
                return null;
            }
            String str = "UTF-8";
            if (typedInput2.mimeType() != null) {
                str = MimeUtil.parseCharset(typedInput2.mimeType(), str);
            }
            return new String(((TypedByteArray) typedInput2).getBytes(), str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.a$h */
    public static final class C21980h implements AbstractC22043e<Object, String> {

        /* renamed from: a */
        static final C21980h f52015a = new C21980h();

        C21980h() {
        }

        static {
            Covode.recordClassIndex(25669);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.AbstractC22043e
        /* renamed from: a */
        public final /* synthetic */ String mo11580a(Object obj) {
            return String.valueOf(obj);
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$i */
    static final class C21981i implements AbstractC22043e<TypedInput, Void> {

        /* renamed from: a */
        static final C21981i f52016a = new C21981i();

        C21981i() {
        }

        static {
            Covode.recordClassIndex(25670);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.retrofit2.AbstractC22043e
        /* renamed from: a */
        public final /* synthetic */ Void mo11580a(TypedInput typedInput) {
            InputStream in = typedInput.mo11577in();
            if (in == null) {
                return null;
            }
            in.close();
            return null;
        }
    }

    C21972a() {
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<?, Object> mo35775a(Type type) {
        if (type == Object.class) {
            return C21975c.f52010a;
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: b */
    public final AbstractC22043e<?, String> mo35776b(Type type) {
        if (type == String.class) {
            return C21978f.f52013a;
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: c */
    public final AbstractC22043e<?, C22027b> mo35777c(Type type) {
        if (type == C22027b.class) {
            return C21974b.f52009a;
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<TypedInput, ?> mo11574a(Type type, Annotation[] annotationArr, C22092q qVar) {
        if (type == TypedInput.class) {
            for (Annotation annotation : annotationArr) {
                if (AbstractC21991ae.class.isInstance(annotation)) {
                    return C21977e.f52012a;
                }
            }
            return C21973a.f52008a;
        } else if (type == String.class) {
            return C21979g.f52014a;
        } else {
            if (type == Void.class) {
                return C21981i.f52016a;
            }
            return null;
        }
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<?, TypedOutput> mo11575a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C22092q qVar) {
        if (TypedOutput.class.isAssignableFrom(C22101w.m41534a(type))) {
            return C21976d.f52011a;
        }
        return null;
    }
}
