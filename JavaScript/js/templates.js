 
 export function title(block){
    return `
    <header>
    <div class="row">

        <div class="col-sm"></div>
        <div class="col-sm"></div>
        <div class="col-sm"><form class="form-inline mt-2 mt-md-0"><div class="flex-box">
            <input  id="search" type="text" placeholder="Search" aria-label="Search">
            <button id="button" class="btn btn-outline-success" type="submit">Search</button>
        </div></form></div>

    </div>
</header>
`


}
export function text(block){
    return `
    <div class="row">
    <div class="col-sm">
        <p>${block.value}</p>
        </div>
    </div>
    `
}
export function columns(block){
    const html = block.value.map(item=>`<div class="col-sm">${item}</div>`)
    return `
    <div class="row">
    ${html.join('')}
    </div>
    `

}