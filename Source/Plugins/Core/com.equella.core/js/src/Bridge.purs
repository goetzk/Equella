module Bridge where 

import Prelude

import Effect.Uncurried (EffectFn1)
import Foreign (Foreign)
import React (ReactClass)
import React.SyntheticEvent (SyntheticEvent)
import Routes (Route(..), routeHref)
import Security.ACLEditor (aclEditorClass)
import Template (templateClass)
import Unsafe.Coerce (unsafeCoerce)

type Bridge = {
    routes :: Foreign,
    router :: Route -> {href::String, onClick :: EffectFn1 SyntheticEvent Unit},
    "Template" :: forall p. ReactClass p,
    "AclEditor" :: forall p. ReactClass p
}

tsBridge :: Bridge 
tsBridge = {
    routes : unsafeCoerce $ {
        "PrivilegesPage": PrivilegesPage,
        "PrivilegeEdit": PrivilegeEdit,
        "CoursesPage": CoursesPage, 
        "CourseEdit": CourseEdit, 
        "NewCourse": NewCourse
        },
    router : routeHref,
    "Template" : unsafeCoerce templateClass,
    "AclEditor" : unsafeCoerce aclEditorClass
} 