package com.p2082ss.avframework.transport;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.io.FileDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.avframework.transport.AndroidNetworkLibrary */
class AndroidNetworkLibrary {
    private static final Set<String> sAutoDohDotServers;
    private static final Set<InetAddress> sAutoDohServers;
    private static Boolean sHaveAccessNetworkState;
    private static Boolean sHaveAccessWifiState;

    public static boolean haveOnlyLoopbackAddresses() {
        return false;
    }

    /* renamed from: com.ss.avframework.transport.AndroidNetworkLibrary$SetFileDescriptor */
    static class SetFileDescriptor {
        private static final Method sFileDescriptorSetInt;

        /* renamed from: com_ss_avframework_transport_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke */
        private static Object m147793x26529ff9(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_avframework_transport_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_avframework_transport_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        private SetFileDescriptor() {
        }

        static {
            Covode.recordClassIndex(100705);
            try {
                sFileDescriptorSetInt = FileDescriptor.class.getMethod("setInt$", Integer.TYPE);
            } catch (NoSuchMethodException | SecurityException e) {
                throw new RuntimeException("Unable to get FileDescriptor.setInt$", e);
            }
        }

        public static FileDescriptor createWithFd(int i) {
            try {
                FileDescriptor fileDescriptor = new FileDescriptor();
                m147793x26529ff9(sFileDescriptorSetInt, fileDescriptor, new Object[]{Integer.valueOf(i)});
                return fileDescriptor;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e2);
            }
        }
    }

    AndroidNetworkLibrary() {
    }

    static {
        Covode.recordClassIndex(100704);
        HashSet hashSet = new HashSet();
        sAutoDohServers = hashSet;
        HashSet hashSet2 = new HashSet();
        sAutoDohDotServers = hashSet2;
        try {
            hashSet.add(InetAddress.getByName("8.8.8.8"));
            hashSet.add(InetAddress.getByName("8.8.4.4"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8888"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8844"));
            hashSet.add(InetAddress.getByName("1.1.1.1"));
            hashSet.add(InetAddress.getByName("1.0.0.1"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1111"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1001"));
            hashSet.add(InetAddress.getByName("9.9.9.9"));
            hashSet.add(InetAddress.getByName("149.112.112.112"));
            hashSet.add(InetAddress.getByName("2620:fe::fe"));
            hashSet.add(InetAddress.getByName("2620:fe::9"));
            hashSet2.add("dns.google");
            hashSet2.add("1dot1dot1dot1.cloudflare-dns.com");
            hashSet2.add("cloudflare-dns.com");
            hashSet2.add("dns.quad9.net");
        } catch (UnknownHostException e) {
            throw new RuntimeException("Failed to parse IP addresses", e);
        }
    }

    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo.".concat(String.valueOf(str)));
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2);
        } catch (KeyStoreException unused) {
            return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
        } catch (NoSuchAlgorithmException unused2) {
            return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
        } catch (IllegalArgumentException unused3) {
            return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
        }
    }
}
