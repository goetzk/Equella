<#include "/com.tle.web.freemarker@/macro/sections.ftl"/>
<#include "/com.tle.web.sections.standard@/textfield.ftl"/>
<#include "/com.tle.web.sections.equella@/component/button.ftl"/>
<#import "/com.tle.web.sections.standard@/ajax.ftl" as a/>

<@css path="search.css" hasRtl=true/>

<@a.div id="searchform" class="area" >
	<div class="query-wrapper" role="search">
		<div id="querycontainer" class="input-append">
			<@textfield section=s.queryField 
				autoSubmitButton="searchform-search" 
				placeholder=b.key('query.hint') />
					
			<@button id="searchform-search" section=s.searchButton showAs="search" class="btn btn-primary add-on" iconOnly=true />
		</div>
	</div>
	
	<@render s.resetFiltersSection/>
	
	<#if m.queryActions??>
			<div class="queryactions">
				<@renderList m.queryActions />
			</div>
		</#if>
</@a.div>
