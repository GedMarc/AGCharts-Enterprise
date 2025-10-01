# AgChartsEnterprise

The JWebMP extension that provides AG Charts Enterprise support on top of the community AgCharts plugin. It mirrors how WebAwesomePro builds on WebAwesome and how FullCalendarPro builds on FullCalendar.

What you get:
- Advanced chart types and enterprise-only features from AG Charts Enterprise
- Proper Angular TypeScript dependency: `ag-charts-enterprise`
- Auto-discovered Page Configurator (no manual wiring) that ensures the Angular build includes enterprise charts

Installation
- Maven: add `com.jwebmp.plugins:agcharts-enterprise:${version}`. If you import the JWebMP BOM the version aligns automatically.
- This module depends on the community plugin `com.jwebmp.plugins:agcharts`.

Usage
- Use as you would the community charts; the enterprise module activates additional charting capabilities on the client side.
- Licensing: If you use AG Charts Enterprise licensing, ensure your application provides the appropriate license key per AG Charts documentation.

Notes
- The Page Configurator pulls in `ag-charts-enterprise` via `@TsDependency`.
- The community configurator continues to provide `ag-charts-community` and `ag-charts-angular`.

Documentation
- See AG Charts docs: https://www.ag-grid.com/charts/
- JWebMP wiki pages will be expanded with enterprise examples.

Progress & Plan
- See module plan and checklist in repository issues or project tracker.
