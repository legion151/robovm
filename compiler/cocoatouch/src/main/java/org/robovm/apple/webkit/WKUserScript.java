/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.webkit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("WebKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKUserScript/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WKUserScriptPtr extends Ptr<WKUserScript, WKUserScriptPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKUserScript.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WKUserScript() {}
    protected WKUserScript(Handle h, long handle) { super(h, handle); }
    protected WKUserScript(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:injectionTime:forMainFrameOnly:")
    public WKUserScript(String source, WKUserScriptInjectionTime injectionTime, boolean forMainFrameOnly) { super((SkipInit) null); initObject(init(source, injectionTime, forMainFrameOnly)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithSource:injectionTime:forMainFrameOnly:inContentWorld:")
    public WKUserScript(String source, WKUserScriptInjectionTime injectionTime, boolean forMainFrameOnly, WKContentWorld contentWorld) { super((SkipInit) null); initObject(init(source, injectionTime, forMainFrameOnly, contentWorld)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "source")
    public native String getSource();
    @Property(selector = "injectionTime")
    public native WKUserScriptInjectionTime getInjectionTime();
    @Property(selector = "isForMainFrameOnly")
    public native boolean isForMainFrameOnly();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:injectionTime:forMainFrameOnly:")
    protected native @Pointer long init(String source, WKUserScriptInjectionTime injectionTime, boolean forMainFrameOnly);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithSource:injectionTime:forMainFrameOnly:inContentWorld:")
    protected native @Pointer long init(String source, WKUserScriptInjectionTime injectionTime, boolean forMainFrameOnly, WKContentWorld contentWorld);
    /*</methods>*/
}
